/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.mapper;

import com.pojo.Address;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * @author 黄建胜
 */
@Repository
public interface AddressMapper {
    /**
     * 查询用户全部的地址信息或某条具体的地址信息
     *
     * @param map map
     * @return address
     */
    List<Address> getAddress(HashMap map);

    /**
     * 插入一个地址
     *
     * @param map map
     * @return 是否成功
     */
    int addAddress(HashMap map);
}
