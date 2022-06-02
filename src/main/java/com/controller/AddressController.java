/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.controller;

import com.pojo.User;
import com.service.AddressService;
import com.unit.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 黄建胜
 * 地址相关接口
 */
@Controller
public class AddressController {
    private AddressService addressServiceImpl;
    @Autowired
    public void setAddressServiceImpl(AddressService addressServiceImpl) {
        this.addressServiceImpl = addressServiceImpl;
    }

    /**
     * 得到当前用户的全部地址信息
     * @param req 获得当前用户
     * @return Json数据
     */
    @RequestMapping(value = "/getAddress" ,method= RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getAddress(HttpServletRequest req){
        User user = (User) req.getSession().getAttribute(Constant.USER);
        String address = addressServiceImpl.getAddress(user);
        return address;
    }

    /**
     * 用户添加一条地址
     * @param userName 联系人姓名
     * @param userNumber 联系方式
     * @param userAddress 详细地址
     * @param req 获得当前用户
     * @return Json数据
     */
    @RequestMapping(value = "/addAddress" ,method= RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String addAddress(@RequestParam("userName") String userName,@RequestParam("userNumber") String userNumber,@RequestParam("userAddress") String userAddress,HttpServletRequest req){
        User user = (User) req.getSession().getAttribute(Constant.USER);
        String s = addressServiceImpl.addAddress(user, userName, userNumber, userAddress);
        return s;
    }
}
