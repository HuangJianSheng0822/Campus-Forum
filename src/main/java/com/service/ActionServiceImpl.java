/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.service;

import com.mapper.ActionMapper;
import com.pojo.Action;
import com.pojo.Address;
import com.pojo.User;
import com.unit.Json;
import com.unit.MyUUID;
import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service("actionServiceImpl")
public class ActionServiceImpl implements ActionService {
    private ActionMapper actionMapper;
    @Autowired
    public void setActionMapper(ActionMapper actionMapper) {
        this.actionMapper = actionMapper;
    }

    @Override
    public String addAction(User user, String kind, String description, String money, String expectedTime, String addressCount) {
        String conId = MyUUID.getUuid();
        Action action=new Action(conId, user.getId(), new Date(), kind, description, Double.valueOf(money), expectedTime, addressCount);
        int i = actionMapper.addActionMapper(action);
        List<String> list=new ArrayList<>();
        if (i>0){
            list.add("成功");
        }else {
            list.add("失败");
        }
        return Json.setJson(list);
    }

    @Override
    public String getAction(String page, String limit) {
        HashMap<String,Object> map=new HashMap<>();
        map.put("peopleTime","peopleTime");
        map.put("page",Integer.valueOf(page)*Integer.valueOf(limit)+1);
        map.put("limit",Integer.valueOf(limit)+1);
        List<Action> action = actionMapper.getAction(map);
        return Json.setJson(action);
    }

    @Override
    public String getActionByUserId(User user, String page, String limit) {
        HashMap<String,Object> map=new HashMap<>();
        map.put("userId",user.getId());
        map.put("page",Integer.valueOf(page));
        map.put("limit",Integer.valueOf(limit));
        List<Action> actionByUserId = actionMapper.getActionByUserId(map);
        return Json.setJson(actionByUserId);
    }

    @Override
    public String updateAction(User user, String conId, String kind) {
        HashMap<String,Object> map=new HashMap<>();
        map.put("userId",user.getId());
        map.put("conId",conId);
        map.put("kind",kind);
        Date date=new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = df.format(date);
        map.put("endTime",time);
        map.put("peopleTime",time);
        int i = actionMapper.updateAction(map);
        List<String> list=new ArrayList<>();
        if (i>0){
            list.add("成功");
        }else {
            list.add("失败");
        }
        return Json.setJson(list);
    }

    @Override
    public String getActionById(String conId) {
        HashMap<String,Object> map=new HashMap<>();
        map.put("conId",conId);
        List<Action> actionById = actionMapper.getActionById(map);
        return Json.setJson(actionById);
    }
}
