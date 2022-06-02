package com.controller;

import com.pojo.RewardMoney;
import com.pojo.User;
import com.service.RewardMoneyService;
import com.unit.Constant;
import com.unit.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 黄建胜
 * 二手交易相关接口
 */
@Controller
public class RewardMoneyController {

    private RewardMoneyService rewardMoneyServiceImpl;

    @Autowired
    public void setRewardMoneyServiceImpl(RewardMoneyService rewardMoneyServiceImpl) {
        this.rewardMoneyServiceImpl = rewardMoneyServiceImpl;
    }

    /**
     * 获得二手物品列表
     * @param v 版本
     * @param page 页数
     * @param limit 数量
     * @return Json数据
     */
    @RequestMapping(value = "/getRewardMoney" ,method= RequestMethod.GET,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getRewardMoney(@RequestParam("v") String v, @RequestParam("page") String page, @RequestParam("limit") String limit){
        List<RewardMoney> rewardMoneyMapper1 = rewardMoneyServiceImpl.getRewardMoney(page, limit);
        return Json.setJson(rewardMoneyMapper1);
    }

    /**
     * 获得二手物品列表根据类型
     * @param kind 类型
     * @param v 版本
     * @param page 页数
     * @param limit 数量
     * @return Json数据
     */
    @RequestMapping(value = "/getRewardMoneyByKind" ,method= RequestMethod.GET,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getRewardMoneyByKind(@RequestParam("kind") String kind,@RequestParam("v") String v, @RequestParam("page") String page, @RequestParam("limit") String limit){
        String rewardMoneyByKind = rewardMoneyServiceImpl.getRewardMoneyByKind(kind, page, limit);
        return rewardMoneyByKind;
    }


    /**
     * 添加二手物品信息
     * @param title 标题
     * @param file 图片
     * @param price 价格
     * @param kind 类型
     * @param content 具体信息
     * @param req 获得当前用户信息
     * @return 页面跳转
     */
    @RequestMapping(value = "/addRewardMoney",method = RequestMethod.POST)
    public String addRewardMoney(@RequestParam("title") String title,
                                 @RequestParam("file") MultipartFile file,
                                 @RequestParam("price") String price,
                                 @RequestParam(value = "kind",required = false) String kind,
                                 @RequestParam(value ="content" ,required = false) String content,
                                 HttpServletRequest req){
        User user = (User) req.getSession().getAttribute(Constant.USER);
        kind="1";
        int i = rewardMoneyServiceImpl.addRewardMoney(title, file, price, kind, content,user);
        if (i>0){
            return "redirect:/page/second-hand.html";
        }else {
            //插入失败
            return null;
        }
    }

    /**
     * 获得一条二手物品的具体信息
     * @param id 二手物品id
     * @return Json数据
     */
    @ResponseBody
    @RequestMapping(value = "getRewardMoneyById",produces = "text/html;charset=UTF-8")
    public String getRewardMoneyById(@RequestParam("id") String id){
        List<RewardMoney> rewardMoneyById = rewardMoneyServiceImpl.getRewardMoneyById(id);
        return Json.setJson(rewardMoneyById);
    }

}

