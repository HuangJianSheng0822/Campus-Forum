/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.service;

import com.mapper.AddressMapper;
import com.pojo.Address;
import com.pojo.User;
import com.unit.Json;
import com.unit.MyUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service("addressServiceImpl")
public class AddressServiceImpl implements AddressService{
    private AddressMapper addressMapper;
    @Autowired
    public void setAddressMapper(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }

    @Override
    public String getAddress(User user) {
        HashMap<String,Object> map=new HashMap<>();
        map.put("userId",user.getId());
        List<Address> address = addressMapper.getAddress(map);
        return Json.setJson(address);
    }

    @Override
    public String addAddress(User user, String userName, String userNumber, String userAddress) {
        HashMap<String,Object> map=new HashMap<>();
        String addressCount = MyUUID.getUuid();
        map.put("addressCount",addressCount);
        map.put("userId",user.getId());
        map.put("userName",userName);
        map.put("userNumber",userNumber);
        map.put("userAddress",userAddress);
        int i = addressMapper.addAddress(map);
        List<String> list=new ArrayList<>();
        if (i>0){
            list.add("成功");
        }else {
            list.add("失败");
        }
        return Json.setJson(list);
    }
}
