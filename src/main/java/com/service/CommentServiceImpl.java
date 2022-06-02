package com.service;

import com.mapper.CommentMapper;
import com.pojo.Comment;
import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 黄建胜
 */
@Service("commentServiceImpl")
public class CommentServiceImpl implements CommentService{

    private CommentMapper commentMapper;

    @Autowired
    public void setCommentMapper(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    /**
     * 根据id查询评论
     * @param id 内容id
     * @return 查询到的评论
     */
    @Override
    public List<Comment> getCommentsById(String id) {
        List<Comment> commentsById = commentMapper.getCommentsById(id);
        return commentsById;
    }

    /**
     * 实现插入评论
     * @param conId 内容id
     * @param user 用户
     * @param userComment 用户评论
     * @return 插入是否成功
     */
    @Override
    public int addComment(String conId, User user, String userComment) {
        int i = commentMapper.addComment(new Comment(conId, user.getId(), userComment));
        return i;
    }

    /**
     * 删除评论
     * @param conId 内容id
     * @param user 用户
     * @return 结果
     */
    @Override
    public int deleteComment(String conId, User user) {
        int i = commentMapper.deleteComment(conId, user.getId());
        return i;
    }


}
