package com.sac.thread.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String... args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
        System.out.println("ApplicationContext initialized");

        System.out.println("Retrieve 'Register'");
        Register register1 = context.getBean(Register.class);
        System.out.println("Retrieve 'Register' again");
        Register register2 = context.getBean(Register.class);
        System.out.println("Register1 == Register2: " + (register1 == register2));

        System.out.println("Clear thread scope");
        ThreadScope threadScope = context.getBean(ThreadScope.class);
        threadScope.clear();

        System.out.println("Retrieve 'Register'");
        Register register3 = context.getBean(Register.class);
        System.out.println("Retrieve 'Register' again");
        Register register4 = context.getBean(Register.class);
        System.out.println("Register3 == Register4: " + (register3 == register4));
    }
}
