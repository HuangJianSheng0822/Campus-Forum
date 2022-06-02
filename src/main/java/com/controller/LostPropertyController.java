package com.controller;

import com.pojo.LostProperty;
import com.pojo.User;
import com.service.LostPropertyService;
import com.service.LostPropertyServiceImpl;
import com.unit.Constant;
import com.unit.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 黄建胜
 * 失物寻找相关接口
 */
@Controller
public class LostPropertyController {

    private LostPropertyService lostPropertyServiceImpl;
    @Autowired
    public void setLostPropertyServiceImpl(LostPropertyService lostPropertyServiceImpl) {
        this.lostPropertyServiceImpl = lostPropertyServiceImpl;
    }

    /**
     * 获得失物的列表
     * @param v 版本
     * @param page 页数
     * @param limit 数量
     * @return Json数据
     */
    @RequestMapping(value = "/getLostProperty" ,method= RequestMethod.GET,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getLostProperty(@RequestParam("v") String v,@RequestParam("page") String page, @RequestParam("limit") String limit){
        List<LostProperty> lostProperty1 = lostPropertyServiceImpl.getLostProperty(page,limit);
        return Json.setJson(lostProperty1);
    }

    /**
     * 用户添加失物信息
     * @param description 具体信息
     * @param type 类型
     * @param address 大概丢失地点
     * @param contant 具体内容
     * @param lostTime 丢失时间
     * @param req 获得当前用户
     * @return Json数据
     */
    @RequestMapping(value = "/admin/addLostProperty" ,method= RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String addLostProperty(@RequestParam("description")String description, @RequestParam("type") String type,
                                  @RequestParam("address")String address, String contant, @RequestParam("lostTime")String lostTime,
                                  HttpServletRequest req){
        User user = (User) req.getSession().getAttribute(Constant.USER);
        List<String> list = lostPropertyServiceImpl.addLostProperty(user, description, type, address, contant, lostTime);
        return Json.setJson(list);
    }

    /**
     * 根据状态查询丢失信息
     * @param status 状态
     * @param page 页数
     * @param limit 数量
     * @return lostPropertyByStatus
     */
    @RequestMapping(value = "/getLostPropertyByStatus" ,method= RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getLostPropertyByStatus(@RequestParam("status") String status,@RequestParam("page") String page, @RequestParam(value = "limit",required = false) String limit){
        String lostPropertyByStatus = lostPropertyServiceImpl.getLostPropertyByStatus(status, page, limit);
        return lostPropertyByStatus;
    }
}
