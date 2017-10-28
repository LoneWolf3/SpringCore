package com.sac.requird.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("/com/sac/requird/annotation/Beans.xml");

      Student student = (Student) context.getBean("student");

      System.out.println("Name : " + student.getName() );
      System.out.println("Age : " + student.getAge() );
   }
}