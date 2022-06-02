/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.service;

import com.pojo.User;



public interface ActionService {
    String addAction(User user, String kind, String description, String money, String expectedTime, String addressCount);
    String getAction(String page,String limit);
    String getActionByUserId(User user,String page,String limit);
    String updateAction(User user,String conId,String kind);
    String getActionById(String conId);
}
