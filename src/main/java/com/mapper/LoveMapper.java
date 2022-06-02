package com.mapper;

import com.pojo.Love;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 黄建胜
 */
@Repository
public interface LoveMapper {

    /**
     * 获得表白信息
     * @param page 页数
     * @param limit 条数
     * @return 列表
     */
    @Select("SELECT * FROM love order by date desc limit #{page},#{limit}")
    @ResultType(Love.class)
    List<Love> getLoveByTime(@Param("page") int page, @Param("limit") int limit);

    /**
     * 插入一条信息
     * @param love 信息
     * @return 是否成功
     */
    @Insert("INSERT INTO " +
            "`love` (`user_id`, `love_id`, `date`, `is_anonymous`, `description`) " +
            "VALUES (#{love.userId}, #{love.loveId}, #{love.date}, #{love.isAnonymous}, #{love.description})")
    int addLove(@Param("love") Love love);

    @Select("select count(love_id) from love")
    int getCount();
}
