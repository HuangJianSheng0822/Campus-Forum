/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.mapper;

import com.pojo.Blog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * @author 黄建胜
 */
@Repository
public interface BlogMapper {
    /**
     * 添加一个博客
     *
     * @param blog blog
     * @return 是否成功
     */
    @Insert("INSERT INTO `blog` (`con_id`, `user_id`, `date`, `title`, `image`, `content`) " +
            "VALUES (#{blog.conId},#{blog.userId} ,#{blog.date} ,#{blog.title} ,#{blog.image} ,#{blog.content} )")
    int addBlog(@Param("blog") Blog blog);

    /**
     * 查询全部博客或某个用户的全部博客包括分页
     *
     * @param map map
     * @return blog
     */
    List<Blog> getBlog(HashMap map);

    /**
     * 查询全部博客数量
     *
     * @return 数量
     */
    @Select("SELECT count(con_id) FROM blog")
    int getCount();
}
