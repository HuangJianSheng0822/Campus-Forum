package com.service;

import com.pojo.Revert;
import com.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 黄建胜
 */
public interface RevertService {
    /**
     * 添加拾取信息
     *
     * 图片可能为空未处理
     *
     * @param user 用户
     * @param type 类型
     * @param pickupTime 拾取时间
     * @param address 地址
     * @param contant 联系方式
     * @param description 描述
     * @param file 图片
     * @return 结果
     */
    int addRevert(User user , String type, String pickupTime, String address, String contant, String description, MultipartFile file);

    String getRevert(User user,String page,String limit);

}
