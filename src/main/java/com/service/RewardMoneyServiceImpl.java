package com.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mapper.RewardMoneyMapper;
import com.pojo.RewardMoney;
import com.pojo.User;
import com.unit.MyUUID;
import com.unit.aliOSS;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author 黄建胜
 */
@Service("rewardMoneyServiceImpl")
public class RewardMoneyServiceImpl implements RewardMoneyService {

    private RewardMoneyMapper rewardMoneyMapper;
    @Autowired
    public void setRewardMoneyMapper(RewardMoneyMapper rewardMoneyMapper) {
        this.rewardMoneyMapper = rewardMoneyMapper;
    }

    /**
     * 分页查询赏金
     * @param page 控制端传来的参数，从第几条开始
     * @param limit 控制端传来的参数，查询几条
     * @return 分页查询到的赏金
     */
    @Override
    public List<RewardMoney> getRewardMoney(String page, String limit) {
        return rewardMoneyMapper.getRewardMoney(Integer.valueOf(page),Integer.valueOf(limit));
    }

    /**
     *根据类型查询
     * @param kind 类型
     * @param page 第几条
     * @param limit 数量
     * @return 查询结果
     */
    @Override
    public String getRewardMoneyByKind(String kind, String page, String limit) {
        List<RewardMoney> rewardMoneyByKind = rewardMoneyMapper.getRewardMoneyByKind(Integer.valueOf(kind), (Integer.valueOf(page)-1)*Integer.valueOf(limit), Integer.valueOf(limit));
        //此时查出的image为key,需要获得链接
        for (int i = 0; i < rewardMoneyByKind.size(); i++) {
            rewardMoneyByKind.get(i).setImage(aliOSS.getImageUrl(rewardMoneyByKind.get(i).getImage()));
        }
        int correct=0;
        int count = rewardMoneyMapper.getCountByCorrectAndKind(correct, Integer.valueOf(kind));
        return setJson(rewardMoneyByKind,count);
    }

    /**
     * 单独设置分页，需要查询数量
     * @return
     */
    public String setJson(List list,int count){
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>(100);
        String s = null;
        ObjectMapper objectMapper1 = new ObjectMapper();
        objectObjectHashMap.put("code", 0);
        objectObjectHashMap.put("msg", "");
        objectObjectHashMap.put("count", count);
        objectObjectHashMap.put("data", list);
        try {
            s = objectMapper1.writeValueAsString(objectObjectHashMap);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return s;
    }
    /**
     * 添加商品，需要获得当前用户id,随机生成的uuid
     * 需要使用到动态sql
     * @param title 标题
     * @param file 图片文件，储存到oss,key与conId相同
     * @param content 富文本编辑器
     * @param price 价格
     * @param user 用户
     * @return 大于0则插入成功
     */
    @Override
    public int addRewardMoney(String title, MultipartFile file, String price, String kind, String content, User user) {
        //随机生成的内容id
        String conId= MyUUID.getUuid();
        //得到用户id
        String userId=user.getId();
        String key="second.jpg";
        if (aliOSS.isFile(file)){
            //将图片储存进oss
            String fileName = file.getOriginalFilename().trim();
            File file1 = new File(file.getOriginalFilename());
            try {
                FileUtils.copyInputStreamToFile(file.getInputStream(), file1);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //生成key
            key=conId+fileName;
            aliOSS.uploadFile(key,file1);
            // 会在本地产生临时文件，用完后需要删除
            if (file1.exists()) {
                file1.delete();
            }
        }
        Date beginDate=new Date();
        double price1 = Double.valueOf(price);
        int kind1 = Integer.valueOf(kind);
        int correct=0;
        int i = rewardMoneyMapper.addRewardMoney(conId,userId,title,key,price1,kind1,content,beginDate,correct);
        return i;
    }

    /**
     * 根据赏金id查询详情
     * @param id 赏金id
     * @return 大于1则查到
     */
    @Override
    public List<RewardMoney> getRewardMoneyById(String id){
        List<RewardMoney> rewardMoneyById = rewardMoneyMapper.getRewardMoneyById(id);
        for (int i = 0; i < rewardMoneyById.size(); i++) {
            rewardMoneyById.get(i).setImage(aliOSS.getImageUrl(rewardMoneyById.get(i).getImage()));
        }
        return rewardMoneyById;
    }

    @Override
    public List<RewardMoney> getUsertRewardMoney(User user, String has) {
        HashMap<String,Object> map=new HashMap<>();
        map.put("userId",user.getId());
        map.put("has",has);
        List<RewardMoney> usertRewardMoney = rewardMoneyMapper.getUsertRewardMoney(map);
        return usertRewardMoney;
    }


}
