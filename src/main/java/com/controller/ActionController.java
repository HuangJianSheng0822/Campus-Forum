/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.controller;

import com.pojo.User;
import com.service.ActionService;
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
 * 跑腿相关接口
 */
@Controller
public class ActionController {
    private ActionService actionServiceImpl;
    @Autowired
    public void setActionServiceImpl(ActionService actionServiceImpl) {
        this.actionServiceImpl = actionServiceImpl;
    }

    /**
     * 用户添加一个跑腿行为
     * @param kind 类型
     * @param description 跑腿的具体描述
     * @param money 金额
     * @param expectedTime 期望结束时间
     * @param addressCount 地址信息
     * @param req 用于获取当前用户信息
     * @return Json数据
     */
    @RequestMapping(value = "/addAction" ,method= RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String addAction(@RequestParam("kind") String kind, @RequestParam("description")String description, @RequestParam("money")String money,
                            @RequestParam("expectedTime")String expectedTime, @RequestParam("addressCount")String addressCount, HttpServletRequest req){
        User user = (User) req.getSession().getAttribute(Constant.USER);
        return actionServiceImpl.addAction(user,kind,description,money,expectedTime,addressCount);
    }

    /**
     *分页查询跑腿数据
     * @param page 页数
     * @param limit 数量
     * @return Json数据
     */
    @RequestMapping(value = "/getAction" ,method= RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getAction(@RequestParam("page") String page,@RequestParam("limit") String limit){
        return actionServiceImpl.getAction(page,limit);
    }

    /**
     * 查询当前用户相关的跑腿行为
     * @param page 页数
     * @param limit 数量
     * @param req 用于获取当前用户信息
     * @return Json数据
     */
    @RequestMapping(value = "/getActionByUserId" ,method= RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getActionByUserId(@RequestParam("page") String page,@RequestParam("limit") String limit,HttpServletRequest req){
        User user = (User) req.getSession().getAttribute(Constant.USER);
        String actionByUserId = actionServiceImpl.getActionByUserId(user, page, limit);
        return actionByUserId;
    }

    /**
     * 更新一个跑腿的状态
     * @param conId 跑腿行为的唯一标识
     * @param kind 类型
     * @param req 获取当前用户信息
     * @return String
     */
    @RequestMapping(value = "/updateAction" ,method= RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String updateAction(@RequestParam(value = "conId") String conId, @RequestParam(value = "kind")String kind,HttpServletRequest req) {
        User user = (User) req.getSession().getAttribute(Constant.USER);
        String s = actionServiceImpl.updateAction(user, conId, kind);
        return s;
    }

    /**
     * 根据跑腿行为的id查询所有信息
     * @param conId 跑腿行为的唯一标识
     * @return action
     */
    @RequestMapping(value = "/getActionById" ,method= RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getActionById(@RequestParam("conId") String conId) {
        String action = actionServiceImpl.getActionById(conId);
        return action;
    }
}
