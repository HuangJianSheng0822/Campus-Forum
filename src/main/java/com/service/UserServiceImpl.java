package com.service;

import com.mapper.UserMapper;
import com.pojo.User;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * @author 黄建胜
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService{


    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * 查询用户
     * @param user 控制端传来的user
     * @return 查询到的用户
     */
    @Override
    public User getUserById(User user) {
        //通过id查询数据库
        User userById = userMapper.getUserById(user.getId());
        boolean is = isUser(user, userById);
        return is?user:null;
    }

    /**
     * 用户注册
     * @param id id
     * @param password 密码
     * @param school 学校
     * @return 结果
     */
    @Override
    public String addUser(String id, String password, String school) {
        //查询该id是否已经被使用
        boolean b = hasUserId(id);
        //如果存在
        if (b){
            return "该用户已经注册";
        }
        //如果不存在，创建新用户
        User user=new User(id, password, school);
        int i = userMapper.addUser(id, password, school);
        if (i>0){
            return "注册成功";
        }else {
            return "注册失败，亲重试";
        }


    }

    /**
     *发送验证码，并且肯定成功
     *
     * @param id
     * @return
     */
    @Override
    public String sendEmail(String id) {
        HtmlEmail email=new HtmlEmail();//创建一个HtmlEmail实例对象
        email.setHostName("smtp.163.com");
        email.setCharset("utf-8");//设置发送的字符类型
        email.setSmtpPort(465);
        email.setSSLOnConnect(true);
        try {
            email.addTo(id);//设置收件人
        } catch (EmailException e) {
            e.printStackTrace();
        }
        try {
            email.setFrom("huang_j_s_0822@163.com","校悦站");
        } catch (EmailException e) {
            e.printStackTrace();
        }
        email.setAuthentication("huang_j_s_0822@163.com","MPPLVWNNXDSRYZIA");
        email.setSubject("校悦站");//设置发送主题

        String val = "";
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            val += String.valueOf(random.nextInt(10));
        }

        try {
            email.setMsg("【校悦站】您的验证码为："+val+"有效期为1分钟，请勿告知他人");//设置发送内容
        } catch (EmailException e) {
            e.printStackTrace();
        }
        String send = null;
        try {
            send = email.send();//进行发送
        } catch (EmailException e) {
            e.printStackTrace();
        }
        return send==null?null:val;
    }

    /**
     * 判断用户是否存在
     * @param user 前端得到的
     * @param userMapper 数据库的用户
     * @return 用户是否存在
     */
    public boolean isUser(User user,User userMapper){
        return user.getId().equals(userMapper.getId())&&user.getPassword().equals(userMapper.getPassword());
    }

    /**
     * 通过id判断用户id是否已经存在
     * @param id
     * @return
     */
    public boolean hasUserId(String id){
        User userById = userMapper.getUserById(id);
        boolean isHaveUserId=(userById!=null);
        return isHaveUserId;
    }
}
