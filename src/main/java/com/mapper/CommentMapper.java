package com.mapper;
import com.pojo.Comment;
import com.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 黄建胜
 */
@Repository
public interface CommentMapper {

    /**
     *根据id查询所有评论
     * @param id
     * @return 评论列表
     */
    @Select("select * from comment where con_id=#{id}")
    @ResultType(Comment.class)
    List<Comment> getCommentsById(@Param("id") String id);

    /**
     * 插入用户评论
     * @param comment
     * @return 插入是否成功
     */
    @Insert("insert into comment(con_id,user_id,user_comment) values(#{comment.conId},#{comment.userId},#{comment.userComment})")
    int addComment(@Param("comment") Comment comment);

    /**
     * 删除用户评论
     * @param conId 评论的id
     * @param userId 用户id
     * @return 是否成功
     */
    int deleteComment(String conId, String userId);
}
