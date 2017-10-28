package com.sac.initialization;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/sac/initialization/Beans.xml");
		System.out.println("Feth bean B.");
		context.getBean("testA");
	}
}