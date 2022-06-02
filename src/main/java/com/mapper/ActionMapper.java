/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.mapper;

import com.pojo.Action;
import com.pojo.Address;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * @author 黄建胜
 */
@Repository
public interface ActionMapper {
    /**
     * 添加跑腿列表
     *
     * @param action 一个任务
     * @return 是否成功
     */
    @Insert("INSERT INTO " +
            "`action` (`con_id`, `user_id`, `begin_time`,  `kind`, `description`, `money`, `expected_time`, `address_count`) " +
            "VALUES (#{action.conId}, #{action.userId}, #{action.beginTime},  #{action.kind}, #{action.description}, " +
            "#{action.money}, #{action.expectedTime}, #{action.addressCount})")
    int addActionMapper(@Param("action")Action action);

    /**
     * 动态查询跑腿
     *
     * 在xml完成
     * 传入的参数可以有peopleTime，userId，page，limit
     * 可以查询全部或个人的全部或未接受的列表
     * @param hashMap map
     * @return action
     */
    List<Action> getAction(HashMap hashMap);

    /**
     * 获得用户具体的某个地址
     *
     * @param addressCount 地址编号
     * @param userId 用户id
     * @return 一个完整的action
     */
    @Select("select address.user_address,address.user_name,address.user_number from address where address_count=#{addressCount} and user_id =#{userId}")
    Address getAddress(@Param("addressCount") String addressCount,@Param("userId")String userId);

    /**
     * 查询当前用户接受的全部行为
     *
     * @param map map
     * @return 列表
     */
    List<Action> getActionByUserId(HashMap map);

    /**
     * 跟该当前用户已经接受的行为，包括取消和已完成
     *
     * @param hashMap map
     * @return 是否成功
     */
    int updateAction(HashMap hashMap);

    /**
     * 根据内容id查询具体信息
     *
     * @param map map
     * @return action
     */
    List<Action> getActionById(HashMap map);
}
