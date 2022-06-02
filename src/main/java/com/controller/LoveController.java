package com.controller;

import com.pojo.Love;
import com.pojo.User;
import com.service.LoveService;
import com.unit.Constant;
import com.unit.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 黄建胜
 * 表白墙相关接口
 */
@Controller
public class LoveController {
    private LoveService loveServiceImpl;

    @Autowired
    public void setLoveServiceImpl(LoveService loveServiceImpl) {
        this.loveServiceImpl = loveServiceImpl;
    }

    /**
     * 查询表白墙列表
     * @param page 页数
     * @param limit 数量
     * @return Json数据
     */
    @RequestMapping(value = "/getLoveByTime" ,method= RequestMethod.GET,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getLoveByTime(@RequestParam("page") String page, @RequestParam("limit")String limit){
        List<Love> list = loveServiceImpl.getLoveByTime(page, limit);
        return Json.setJson(list);
    }

    /**
     * 添加一条表白信息
     * @param description 具体描述
     * @param isAnonymous 是否匿名
     * @param req 获得当前用户
     * @return 进行页面跳转
     */
    @RequestMapping(value ="/addLove",method = RequestMethod.POST)
    public String addLove(@RequestParam("description")String description,
                          @RequestParam(value = "isAnonymous",required = false) String isAnonymous,
                          HttpServletRequest req){
        User user = (User) req.getSession().getAttribute(Constant.USER);
        int i=-1;
        if (isAnonymous==null){
            i=loveServiceImpl.addLove(user,"0",description);
        }else {
            i=loveServiceImpl.addLove(user,"1",description);
        }
        return "redirect:/page/love.html";

    }
}
