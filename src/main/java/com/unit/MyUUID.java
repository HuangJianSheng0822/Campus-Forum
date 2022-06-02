package com.unit;

import static java.util.UUID.randomUUID;

/**
 * @author 黄建胜
 */
public class MyUUID {

    /**
     * 随机生成一个uuid
     * @return 随机生成的uuid,未处理
     */
    public static String getUuid() {
        return randomUUID().toString();
    }

}
