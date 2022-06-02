package com.mapper;

import com.pojo.LostProperty;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;

/**
 * @author 黄建胜
 */

@Repository
public interface LostPropertyMapper {
    /**
     * 分页查询失物寻找，通过注解实现
     * @param page 从第几条开始
     * @param limit 查询多少条
     * @return 查询到的数据
     */
    @Select("select * from lostpropertysearch limit #{page} ,#{limit}")
    List<LostProperty> getLostProperty(@Param("page") int page, @Param("limit") int limit);

    /**
     * 添加addLostProperty
     * @param lostProperty 失物信息
     * @return 是否成功
     */
    @Insert("INSERT INTO `lostpropertysearch` (`id`, `user_id`, `description`, `date`, `status`, `type`, `address`, `contant`, `lost_time`) " +
            "VALUES (#{lostProperty.id}, #{lostProperty.userId}, #{lostProperty.description}, #{lostProperty.date}, #{lostProperty.status}, " +
            "#{lostProperty.type}, #{lostProperty.address}, #{lostProperty.contant},#{lostProperty.lostTime})")
    int addLostProperty(@Param("lostProperty") LostProperty lostProperty);

    /**
     * 查询失误列表通过状态
     * @param status 状态
     * @param page 页数
     * @param limit 条数
     * @return 列表
     */
    @Select("SELECT * from lostpropertysearch where `status`=#{status} order by date desc limit #{page},#{limit}")
    @ResultType(LostProperty.class)
    List<LostProperty> getLostPropertyByStatus(@Param("status")int status,@Param("page")int page,@Param("limit")int limit);

    @Select("SELECT COUNT(id) FROM lostpropertysearch where `status`=#{status}")
    int getLostPropertyCountByStatus(HashMap map);
}
