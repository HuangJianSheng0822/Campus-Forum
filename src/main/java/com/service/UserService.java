package com.service;

import com.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 黄建胜
 */

public interface UserService {
    /**
     * 通过控制端传来的user查询用户
     * @param user 控制端传来的user
     * @return 查询到的用户
     */
    User getUserById(User user);

    /**
     * 用户注册
     * @param id id
     * @param password 密码
     * @param school 学校
     * @return 结果
     */
    String addUser(String id,String password,String school);

    String sendEmail(String id);
}
