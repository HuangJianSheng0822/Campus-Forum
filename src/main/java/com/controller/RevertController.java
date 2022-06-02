package com.controller;

import com.pojo.User;
import com.service.RevertService;
import com.unit.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 黄建胜
 * 寻找失主相关接口
 */
@Controller
public class RevertController {
    private RevertService  revertServiceImpl;

    @Autowired
    public void setRevertServiceImpl(RevertService revertServiceImpl) {
        this.revertServiceImpl = revertServiceImpl;
    }

    /**
     * 添加一条寻找信息
     * @param type 类型
     * @param pickupTime 拾取时间
     * @param address 地址
     * @param contant 内容
     * @param description 描述
     * @param file 拾取物品图片
     * @param req 获得当前用户
     * @return 进行页面跳转
     */
    @RequestMapping(value = "/admin/addRevert" ,method = RequestMethod.POST)
    public String addRevert(@RequestParam("type")String type,
                            @RequestParam("pickupTime")String pickupTime, @RequestParam("address")String address,
                            @RequestParam("contant")String contant, @RequestParam("description")String description,
                            @RequestParam(value = "file",required = false)MultipartFile file, HttpServletRequest req){
        User user = (User) req.getSession().getAttribute(Constant.USER);
        int i = revertServiceImpl.addRevert(user, type, pickupTime, address, contant, description, file);
        if (i>0){
            return "redirect:/page/revert.html";
        }else {
            //插入失败
            return null;
        }
    }

    /**
     * 获得寻找失主的列表
     * @param page 页数
     * @param req 获得当前用户信息
     * @return Json数据
     */
    @ResponseBody
    @RequestMapping(value = "/getRevert",method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
    public String getRevert(@RequestParam("page") String page, HttpServletRequest req){
        User user=null;
        if (req.getSession().getAttribute(Constant.USER)!=null){
            user = (User) req.getSession().getAttribute(Constant.USER);
        }
        String limit="20";
        return revertServiceImpl.getRevert(user,page,limit);
    }
}
