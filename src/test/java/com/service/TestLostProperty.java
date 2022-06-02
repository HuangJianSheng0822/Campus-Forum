//package com.service;
//
//import com.mapper.RewardMoney;
//import com.pojo.User;
//import com.unit.Json;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import java.util.List;
//
//public class TestLostProperty {
//    @Test
//    public void testGetLostProperty() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
//        LostPropertyImpl lostPropertyImpl = context.getBean("LostProperty", LostPropertyImpl.class);
//        System.out.println(Json.setJson(lostPropertyImpl.getLostProperty("0", "2")));
//    }
//
//    @Test
//    public void testGetRewardMoney() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
//        RewardMoneyImpl rewardMoney = context.getBean("RewardMoney", RewardMoneyImpl.class);
//        List<RewardMoney> rewardMoney1 = rewardMoney.getRewardMoney("0", "5");
//        System.out.println(Json.setJson(rewardMoney1));
//    }
//
//    @Test
//    public void testGetUserById() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
//        UserServiceImpl user = context.getBean("user", UserServiceImpl.class);
//        System.out.println("用户："+user.getUserById(new User("admin","123456","sspu")));
//    }
//
//    @Test
//    public void testAddRewardMoney() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
//        RewardMoneyImpl rewardMoney = context.getBean("RewardMoney", RewardMoneyImpl.class);
//        rewardMoney.addRewardMoney("t1","t1","t1","20",new User("admin","password","sspu"));
//    }
//
//    @Test
//    public void testGetCommentById() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
//        CommentServiceImpl comment = context.getBean("comment", CommentServiceImpl.class);
//        System.out.println(comment.getCommentsById("22e6dd94-4dd1-4aa6-bf89-c785287ee144"));
//    }
//
//    @Test
//    public void testGetRewardMoneyById() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
//        RewardMoneyImpl rewardMoney = context.getBean("RewardMoney", RewardMoneyImpl.class);
//        List<com.pojo.RewardMoney> rewardMoneyById = rewardMoney.getRewardMoneyById("1");
//        System.out.println(rewardMoneyById);
//    }
//}
