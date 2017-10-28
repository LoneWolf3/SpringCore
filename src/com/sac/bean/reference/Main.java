package com.sac.bean.reference;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("/com/sac/bean/reference/a.xml");
		System.out.println("Getting person bean");
		Person person = (Person) beanFactory.getBean("person");
		System.out.println("Person detail is " + person.getPersonDetail());
	}

}
