package com.service;

import com.mapper.RewardMoneyMapper;
import com.pojo.RewardMoney;
import com.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.List;

/**
 * @author 黄建胜
 */

public interface RewardMoneyService {

    /**
     * 分页查询赏金内容
     * @param page 控制端传来的参数，从第几条开始
     * @param limit 控制端传来的参数，查询几条
     * @return 查询到的赏金内容
     */
    List<RewardMoney> getRewardMoney(String page, String limit);

    /**
     * 通过分类分页查询赏金内容，若有其他条件可修改该方法
     * @param kind 类型
     * @param page 第几条
     * @param limit 数量
     * @return 查询列表
     */
    String getRewardMoneyByKind(String kind,String page,String limit);

    /**
     *插入赏金猎人
     * @param title 标题
     * @param file 图片文件
     * @param price 价格
     * @param kind 类型
     * @param content 内容
     * @param user 用户
     * @return 大于1插入成功
     */
    int addRewardMoney(String title, MultipartFile file, String price, String kind, String content, User user);

    /**
     * 根据赏金id查询详情
     * @param id 赏金id
     * @return 详情
     */
    List<RewardMoney> getRewardMoneyById(String id);

    List<RewardMoney> getUsertRewardMoney(User user,String has);

}
