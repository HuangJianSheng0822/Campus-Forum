package com.service;

import com.pojo.Comment;
import com.pojo.User;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * @author 黄建胜
 */
public interface CommentService {

    /**
     * 根据id查询所有评论
     * @param id 内容id
     * @return 查询到的列表
     */
    List<Comment> getCommentsById(String id);

    /**
     * 插入用户评论
     * @param conId 内容id
     * @param user 用户
     * @param userComment 用户评论
     * @return 插入是否成功
     */
    int addComment(String conId, User user, String userComment);

    /**
     * 删除评论
     * @param conId 内容id
     * @param user 用户
     * @return 结果
     */
    int deleteComment(String conId, User user);
}
