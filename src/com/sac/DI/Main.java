package com.sac.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/sac/DI/test.xml");
		SeqGenConsAmb obj = (SeqGenConsAmb) context.getBean("c");
		System.out.println(obj.getSequence());
	}

}
