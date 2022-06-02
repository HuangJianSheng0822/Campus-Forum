package com.controller;

import com.pojo.User;
import com.service.UserServiceImpl;
import com.unit.Constant;
import com.unit.Json;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author 黄建胜
 * 用户相关接口
 */
@Controller
public class UserController {


    private UserServiceImpl userServiceImpl;

    @Autowired
    public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    /**
     * 用户登录
     * @param id 用户id
     * @param password 密码
     * @param req 添加当前用户
     * @return 页面跳转
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String userLogin(@RequestParam("id")String id,@RequestParam("password")String password, HttpServletRequest req){
        User userById = userServiceImpl.getUserById(new User(id,password,null));
        //用户存在
        if (userById!=null){
            req.getSession().setAttribute(Constant.USER,userById);

        }
        return "redirect:/index.html";
    }


    /**
     * 用户注册
     * @param id 用户id
     * @param key 验证码
     * @param pwd 密码
     * @param school 学校
     * @param req 检验验证码是否超时
     * @return Json数据
     */
    @RequestMapping(value = "/userRegister",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String userRegister(@RequestParam("id") String id, @RequestParam("key")String key, @RequestParam("pwd")String pwd, @RequestParam("school")String school, HttpServletRequest req){
        List<String> list=new ArrayList<>();
        //检验验证码是否已经超时
        Object attribute = req.getSession().getAttribute(Constant.CODE);
        //超时
        if (attribute==null){
            list.add("注册失败，请重试");
            return Json.setJson(list);
        }
        //将用户传来的邮箱和验证码进行比较
        HashMap<String,String> attribute1= (HashMap<String, String>) attribute;
        System.out.println(attribute1);
        if (!attribute1.get(id).equals(key)){
            list.add("注册失败，请重试");
            System.out.println(attribute1.get(id));
            return Json.setJson(list);
        }
        String s = userServiceImpl.addUser(id, pwd, school);
        list.add(s);
        return Json.setJson(list);
    }

    /**
     * 判断用户是否已经登录
     * @param req 获得当前用户
     * @return Json数据
     */
    @RequestMapping(value = "/hasLogin",method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String hasLogin(HttpServletRequest req){
        List<Object> list=new ArrayList<>();
        list.add(req.getSession().getAttribute(Constant.USER));
        return Json.setJson(list);
    }

    /**
     * 发送邮件
     * @param id 用户邮箱
     * @param req 验证码录入
     * @return Json数据
     */
    @RequestMapping(value = "/sendEmail",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String sendEmail(String id,HttpServletRequest req){
        List<String> list=new ArrayList<>();
        //判断该邮箱是否已经被注册
        if (userServiceImpl.hasUserId(id)){
            list.add("该用户已经注册");
            return Json.setJson(list);
        }
        HttpSession session = req.getSession();
        session.setMaxInactiveInterval(60);
        String code = userServiceImpl.sendEmail(id);
        //将邮箱与验证码放在map中,邮箱作为key,code作为value
        HashMap<String,String> map=new HashMap<>();
        map.put(id,code);
        session.setAttribute(Constant.CODE,map);
        //设置该session有效期为1分钟
        session.setMaxInactiveInterval(60);
        if (code!=null){
            list.add("验证码有效期为1分钟");
            return Json.setJson(list);
        }else {
            list.add("发送失败");
            return Json.setJson(list);
        }

    }
}
