package com.wzy.dubbo.consumer;

import com.wzy.dubbo.demo.DemoService;
import com.wzy.dubbo.demo.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    /*public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermissions());

    }*/
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        UserService demoService = context.getBean(UserService.class);
        System.out.println("consumer");
        System.out.println(demoService.getAll().get(0).getId());

    }
}
