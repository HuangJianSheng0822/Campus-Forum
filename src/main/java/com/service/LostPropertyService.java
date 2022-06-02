package com.service;

import com.pojo.LostProperty;
import com.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 黄建胜
 */

public interface LostPropertyService {

    /**
     * 分页查询失物寻找
     * @param page 控制端传来的参数，从第几条开始
     * @param limit 控制端传来的参数，查询几条
     * @return 查询到的失物寻找信息
     */
    List<LostProperty> getLostProperty(String page, String limit);

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
    List<String> addLostProperty(User user,String description,String type,String address,String contant,String lostTime);

    /**
     * 根据状态查询丢失信息
     * @param status 状态
     * @param page 页数
     * @param limit 条数
     * @return 列表
     */
    String getLostPropertyByStatus(String status,String page,String limit);


}
