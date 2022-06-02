package com.service;

import com.pojo.Love;
import com.pojo.User;

import java.util.List;

/**
 * @author 黄建胜
 */
public interface LoveService {
    /**
     * 查询表白列表
     * @param page 页数
     * @param limit 条数
     * @return 结果
     */
    List<Love> getLoveByTime(String page,String limit);

    /**
     * 添加表白信息
     * @param user 用户
     * @param isAnonymous 是否匿名
     * @param description 描述
     * @return 是否成功
     */
    int addLove(User user, String isAnonymous, String description);
}
