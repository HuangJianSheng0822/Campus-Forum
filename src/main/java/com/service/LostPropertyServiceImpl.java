package com.service;

import com.mapper.LostPropertyMapper;
import com.pojo.LostProperty;
import com.pojo.User;
import com.unit.Json;
import com.unit.MyUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author 黄建胜
 */
@Service("lostPropertyServiceImpl")
public class LostPropertyServiceImpl implements LostPropertyService {


    private LostPropertyMapper lostPropertyMapper;

    @Autowired
    public void setLostPropertyMapper(LostPropertyMapper lostPropertyMapper) {
        this.lostPropertyMapper = lostPropertyMapper;
    }

    /**
     * 分页查询失物
     * @param page 控制端传来的参数，从第几条开始
     * @param limit 控制端传来的参数，查询几条
     * @return 查询到的失物
     */
    @Override
    public List<LostProperty> getLostProperty(String page,String limit) {
        return lostPropertyMapper.getLostProperty(Integer.parseInt(page), Integer.parseInt(limit));
    }

    /**
     * 添加丢失信息
     * @param user 用户
     * @param description 描述
     * @param type 类型
     * @param address 地址
     * @param contant 联系方式
     * @param lostTime 丢失时间
     * @return 列表
     */
    @Override
    public List<String> addLostProperty(User user, String description, String type, String address, String contant,String lostTime) {
        int i = lostPropertyMapper.addLostProperty(new LostProperty(MyUUID.getUuid(), user.getId(), description, new Date(), -1, type, address, contant, lostTime));
        List<String> list=new ArrayList<>();
        if (i>0){
            list.add("添加成功");
        }else {
            list.add("添加失败");
        }
        return list;
    }

    /**
     * 根据状态查询丢失信息
     * @param status 状态
     * @param page 页数
     * @param limit 条数
     * @return 列表
     */
    @Override
    public String getLostPropertyByStatus(String status, String page, String limit) {
        HashMap<String,Object> map=new HashMap<>();
        map.put("status",Integer.valueOf(status));
        List<LostProperty> lostPropertyByStatus = lostPropertyMapper.getLostPropertyByStatus(Integer.valueOf(status), (Integer.valueOf(page)-1)*Integer.valueOf(limit)+1, Integer.valueOf(limit));
        int pages = (int) Math.ceil(lostPropertyMapper.getLostPropertyCountByStatus(map) * 1.0 / Integer.valueOf(limit));
        return Json.setJson(pages+"",lostPropertyByStatus);
    }
}
