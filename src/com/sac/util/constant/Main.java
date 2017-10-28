package com.sac.util.constant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spel-static.xml");

        MyBean bean = (MyBean) context.getBean("myBean");
        System.out.println("bean.getRandomNumber() = " + bean.getRandomNumber());
        System.out.println("bean.getPi()           = " + bean.getPi());
        System.out.println("bean.getName()         = " + bean.getName());
    }
}