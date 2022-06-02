/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.controller;

import com.pojo.Comment;
import com.pojo.User;
import com.service.BlogService;
import com.unit.Constant;
import com.unit.Json;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 黄建胜
 * 吐槽相关接口
 */

@Controller
public class BlogController {
    private BlogService blogServiceImpl;

    @Autowired
    public void setBlogServiceImpl(BlogService blogServiceImpl) {
        this.blogServiceImpl = blogServiceImpl;
    }

    /**
     * 获得吐槽信息，方式为流加载
     * @param page 页数
     * @param req 获得当前用户信息
     * @return Json数据
     */
    @ResponseBody
    @RequestMapping(value = "/getBlog",method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
    public String getBlog(@RequestParam("page") String page, HttpServletRequest req){
        User user=null;
        if (req.getSession().getAttribute(Constant.USER)!=null){
            user = (User) req.getSession().getAttribute(Constant.USER);
        }
        String limit="20";
        return blogServiceImpl.getBlog(user,page,limit);
    }

    /**
     * 添加一条吐槽信息
     * @param title 标题
     * @param content 具体内容
     * @param file 封面
     * @param req 获得当前用户信息
     * @return 进行页面跳转
     */
    @RequestMapping(value = "/addBlog",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    public String addBlog(@Param("title") String title,@Param("content") String content, @Param("file")MultipartFile file, HttpServletRequest req){
        User user=null;
        if (req.getSession().getAttribute(Constant.USER)!=null){
            user = (User) req.getSession().getAttribute(Constant.USER);
        }
        int i = blogServiceImpl.addBlog(user, content, title, file);
        if (i>0){
            return "redirect:/page/debunk.html";
        }else {
            //插入失败
            return null;
        }
    }
}
