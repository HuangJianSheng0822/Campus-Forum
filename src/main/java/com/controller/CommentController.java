package com.controller;

import com.pojo.Comment;
import com.pojo.User;
import com.service.CommentService;
import com.unit.Constant;
import com.unit.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 黄建胜
 * 用户评论相关接口
 */
@Controller
public class CommentController {

    private CommentService commentServiceImpl;

    @Autowired
    public void setCommentServiceImpl(CommentService commentServiceImpl) {
        this.commentServiceImpl = commentServiceImpl;
    }

    /**
     * 根据内容id获得与当前内容有关的评论
     * @param id 内容id
     * @return Json数据
     */
    @ResponseBody
    @RequestMapping(value = "/getCommentById",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    public String getCommentsById(@RequestParam("id") String id){
        List<Comment> commentsById = commentServiceImpl.getCommentsById(id);
        return Json.setJson(commentsById);
    }

    /**
     * 用户进行评论
     * @param conId 内容id
     * @param userComment 用户具体的评论
     * @param req 获得当前用户信息
     * @return Json数据
     */
    @ResponseBody
    @RequestMapping(value = "/admin/addComment",method = RequestMethod.POST,produces ="text/html;charset=UTF-8" )
    public String  addComment(@RequestParam("conId")String conId, @RequestParam("userComment")String userComment, HttpServletRequest req){
        User user = (User) req.getSession().getAttribute(Constant.USER);
        int i = commentServiceImpl.addComment(conId, user, userComment);
        List<String> list=new ArrayList<>();
        if(i>0){
            list.add("评论成功");
            return Json.setJson(list) ;
        }else {
            list.add("插入失败");
            return Json.setJson(list) ;
        }
    }
}
