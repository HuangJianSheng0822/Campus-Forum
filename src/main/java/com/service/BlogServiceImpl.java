/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.service;

import com.mapper.BlogMapper;
import com.pojo.Blog;
import com.pojo.User;
import com.unit.Json;
import com.unit.MyUUID;
import com.unit.aliOSS;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service("blogServiceImpl")
public class BlogServiceImpl implements BlogService{
    private BlogMapper blogMapper;

    @Autowired
    public void setBlogMapper(BlogMapper blogMapper) {
        this.blogMapper = blogMapper;
    }

    @Override
    public int addBlog(User user, String content, String title, MultipartFile file) {

        //随机生成的内容id
        String conId= MyUUID.getUuid();
        //得到用户id
        String userId=user.getId();
        String key="blog.jpg";
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
        Date date=new Date();
        int i = blogMapper.addBlog(new Blog(conId, userId, date, title, key, content));

        return i;
    }

    @Override
    public String getBlog(User user, String page, String limit) {
        HashMap<String,Object> map=new HashMap<>();
        if (user!=null){
            map.put("userId",user.getId());
        }
        map.put("page",Integer.valueOf(Integer.valueOf(page)-1)*Integer.valueOf(limit)+1);
        map.put("limit",Integer.valueOf(limit));
        List<Blog> blog = blogMapper.getBlog(map);
        for (int i = 0; i < blog.size(); i++) {
            blog.get(i).setImage(aliOSS.getImageUrl(blog.get(i).getImage()));
        }
        int pages = (int) Math.ceil(blogMapper.getCount() * 1.0 / Integer.valueOf(limit));
        return Json.setJson(pages+"",blog);
    }
}
