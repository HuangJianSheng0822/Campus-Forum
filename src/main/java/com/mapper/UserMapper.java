package com.mapper;

import com.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author 黄建胜
 */
@Repository
public interface UserMapper {

    /**
     * 根据id查询一个对象，注解实现
     * @param id 用户id
     * @return 用户是否存在
     */
    @Select("select * from user where id= #{id}")
    User getUserById(@Param("id")String id);

    /**
     * 用户注册
     * @param id 用户id
     * @param password 密码
     * @param school 学校
     * @return 是否成功
     */
    @Insert("INSERT INTO `test`.`user`(`id`, `password`, `school`) VALUES (#{id}, #{password}, #{school})")
    int addUser(@Param("id")String id,@Param("password")String password,@Param("school")String school);
}
