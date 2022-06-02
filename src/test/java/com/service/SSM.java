package com.service;

import com.pojo.LostProperty;
import com.pojo.Love;
import com.pojo.RewardMoney;
import com.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class SSM {
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application-config.xml");
        LostPropertyServiceImpl lostPropertyImpl = ac.getBean("lostPropertyImpl", LostPropertyServiceImpl.class);
        List<LostProperty> lostProperty = lostPropertyImpl.getLostProperty("1", "2");
        System.out.println(lostProperty);

    }

    @Test
    public void run2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application-config.xml");
        LostPropertyServiceImpl lostPropertyImpl = ac.getBean("lostPropertyImpl", LostPropertyServiceImpl.class);
        List<LostProperty> lostProperty = lostPropertyImpl.getLostProperty("1", "2");
        System.out.println(lostProperty);

    }

    @Test
    public void run3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application-config.xml");
        RewardMoneyServiceImpl rewardMoneyServiceImpl = ac.getBean("rewardMoneyServiceImpl", RewardMoneyServiceImpl.class);
//        List<RewardMoneyMapper> rewardMoney = rewardMoneyServiceImpl.getRewardMoney("1", "3");
//        System.out.println(rewardMoney);

    }
    @Test
    public void run4(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application-config.xml");
        RewardMoneyServiceImpl rewardMoneyServiceImpl = ac.getBean("rewardMoneyServiceImpl", RewardMoneyServiceImpl.class);
        List<RewardMoney> usertRewardMoney = rewardMoneyServiceImpl.getUsertRewardMoney(new User("admin", "123456", "sspu"), "ll");
        System.out.println(usertRewardMoney);
    }
    @Test
    public void run5(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application-config.xml");
        UserServiceImpl userServiceImpl = ac.getBean("userServiceImpl", UserServiceImpl.class);
        String s = userServiceImpl.sendEmail("2311735233@qq.com");
        System.out.println(s);
    }
    @Test
    public void run6(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application-config.xml");
        CommentServiceImpl commentImpl = ac.getBean("commentServiceImpl", CommentServiceImpl.class);
        int i = commentImpl.addComment("1", new User("1", "1", "1"), "3");
        System.out.printf("i");
    }

    @Test
    public void run7(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application-config.xml");
        LoveServiceImpl loveServiceImpl = ac.getBean("loveServiceImpl", LoveServiceImpl.class);
        List<Love> loveByTime = loveServiceImpl.getLoveByTime("0", "5");
        System.out.println(loveByTime);
    }

    @Test
    public void run8(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application-config.xml");
        ActionServiceImpl actionServiceImpl = ac.getBean("actionServiceImpl", ActionServiceImpl.class);
        String action = actionServiceImpl.getAction("0", "2");
        System.out.print(action);

    }

    @Test
    public void run9(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application-config.xml");
        ActionServiceImpl actionServiceImpl = ac.getBean("actionServiceImpl", ActionServiceImpl.class);
        String actionByUserId = actionServiceImpl.getActionByUserId(new User("2", "1", "1"), "0", "50");
        System.out.print(actionByUserId);

    }

    @Test
    public void run10(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application-config.xml");
        ActionServiceImpl actionServiceImpl = ac.getBean("actionServiceImpl", ActionServiceImpl.class);
        String action = actionServiceImpl.getActionById("ade1a042-a6c0-4755-83ab-14244219b60b");
        System.out.print(action);

    }
}
