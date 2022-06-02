package com.unit;

import org.junit.Test;

public class TestOss {
    @Test
    public void test1(){
        String imageUrl = aliOSS.getImageUrl("f1c39046-0c1a-4f78-b698-55cb615eec4a9.jpg");
        System.out.println(imageUrl);
    }
}
