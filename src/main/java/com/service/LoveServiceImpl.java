package com.service;

import com.mapper.LoveMapper;
import com.pojo.Love;
import com.pojo.User;
import com.unit.MyUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author 黄建胜
 */
@Service("loveServiceImpl")
public class LoveServiceImpl implements LoveService{

    private LoveMapper loveMapper;

    @Autowired
    public void setLoveMapper(LoveMapper loveMapper) {
        this.loveMapper = loveMapper;
    }

    /**
     * 查询表白列表
     * @param page 页数
     * @param limit 条数
     * @return 结果
     */
    @Override
    public List<Love> getLoveByTime(String page, String limit) {
        List<Love> loveByTime = loveMapper.getLoveByTime((Integer.valueOf(page)-1)*Integer.valueOf(limit)+1, Integer.valueOf(limit));
        for (Love love :loveByTime ) {
            if (love.getIsAnonymous()==1){
                love.setUserId("匿名用户");
            }
        }
        return loveByTime;
    }


    /**
     * 添加表白信息
     * @param user 用户
     * @param isAnonymous 是否匿名
     * @param description 描述
     * @return 是否成功
     */
    @Override
    public int addLove(User user, String isAnonymous, String description) {
        //随机生产内容id
        return loveMapper.addLove(new Love(user.getId(), MyUUID.getUuid(),new Date(),Integer.valueOf(isAnonymous),description));
    }
}
