package com.service;

import com.mapper.RevertMapper;
import com.pojo.Blog;
import com.pojo.Revert;
import com.pojo.User;
import com.unit.Json;
import com.unit.MyUUID;
import com.unit.aliOSS;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author 黄建胜
 */
@Service("revertServiceImpl")
public class RevertServiceImpl implements RevertService{
    private RevertMapper revertMapper;

    @Autowired
    public void setRevertMapper(RevertMapper revertMapper) {
        this.revertMapper = revertMapper;
    }

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
    @Override
    public int addRevert(User user, String type, String pickupTime, String address, String contant, String description, MultipartFile file) {
        //随机生成的内容id
        String conId= MyUUID.getUuid();
        //得到用户id
        String userId=user.getId();
        String key="revert.png";
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
        int i = revertMapper.addRevert(new Revert(conId, userId, new Date(), type, pickupTime, address, contant, key, description));
        return i;
    }

    @Override
    public String getRevert(User user, String page, String limit) {
        HashMap<String,Object> map=new HashMap<>();
        if (user!=null){
            map.put("userId",user.getId());
        }
        map.put("page",Integer.valueOf(page));
        map.put("limit",Integer.valueOf(limit));
        List<Revert> revert = revertMapper.getRevert(map);
        for (int i = 0; i < revert.size(); i++) {
            revert.get(i).setImage(aliOSS.getImageUrl(revert.get(i).getImage()));
        }
        int pages = (int) Math.ceil(revertMapper.getCount() * 1.0 / Integer.valueOf(limit));
        return Json.setJson(pages+"",revert);
    }
}
