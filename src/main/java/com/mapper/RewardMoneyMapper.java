package com.mapper;

import com.pojo.RewardMoney;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author 黄建胜
 */
@Repository
public interface RewardMoneyMapper {

    /**
     * 分页查询赏金内容，在xml里实现，注解有未知bug
     * @param page 第几条开始
     * @param limit 查询多少
     * @return 查询到的数据
     */
    List<RewardMoney> getRewardMoney(@Param("page") int page, @Param("limit") int limit);

    /**
     * 根据类型查询，时间降序排序
     * @param kind 种类，有0，1，2
     * @param page 第几条开始
     * @param limit 多少条
     * @return 查询列表
     */
    @Select("select * from rewardmoney where kind =#{kind} and correct=0 and recipient is null and end_date is null ORDER BY begin_date desc limit #{page},#{limit}")
    List<RewardMoney> getRewardMoneyByKind(@Param("kind") int kind,@Param("page") int page,@Param("limit") int limit);

    /**
     * 插入一条赏金猎人内容
     * @param conId 内容id
     * @param userId 用户id
     * @param title 标题
     * @param image 图片地址
     * @param price 价格
     * @param kind 类型
     * @param content 博客内容
     * @param beginDate 发布日期
     * @param correct 是否审核
     * @return 返回值大于0，插入成功
     */
    @Insert("INSERT INTO"
            +"`test`.`rewardmoney`(`con_id`, `user_id`, `title`, `image`, `price`, `kind`, `content`, `begin_date`, `correct`)"
            + "VALUES (#{conId},#{userId},#{title},#{image},#{price},#{kind},#{content},#{beginDate},#{correct})")
    int addRewardMoney(@Param("conId") String conId,
                       @Param("userId") String userId,
                       @Param("title") String title,
                       @Param("image") String image,
                       @Param("price") double price,
                       @Param("kind") int kind,
                       @Param("content") String content,
                       @Param("beginDate") Date beginDate,
                       @Param("correct") int correct
                       );

    /**
     * 根据id查询对应赏金详情
     * @param id 赏金id
     * @return 查询详情
     */
    @Select("select * from rewardmoney where con_id=#{id}")
    List<RewardMoney> getRewardMoneyById(@Param("id") String id);

    /**
     * 查询数量
     *
     * @param correct 未知
     * @param kind 类型
     * @return 数量
     */
    @Select("SELECT COUNT(con_id) FROM rewardmoney where correct=#{correct} and kind =#{kind}")
    int getCountByCorrectAndKind(@Param("correct") int correct,@Param("kind") int kind);


    /**
     * 查询当前用户全部是否已经被接受的
     *
     * @param hashMap map
     * @return rewardMoney
     */
    List<RewardMoney> getUsertRewardMoney(HashMap hashMap);

}
