package com.sac.international;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) throws IOException {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("config\\spring-config.xml");

		Locale english = Locale.ENGLISH;
		System.out.println("Enter ur First Name");
		DataInputStream d = new DataInputStream(System.in);
		String firstName = d.readLine();
		System.out.println("Enter ur Last Name");
		String lastName = d.readLine();

		System.out.println("English:");
		System.out.println(applicationContext.getMessage("nameMsg", new Object[] { firstName, lastName }, english));
		// ***English
		System.out.println("Dutch:");
		Locale dutch = new Locale("du");
		System.out.println(applicationContext.getMessage("msg", null, dutch));

		System.out.println("French:");
		Locale french = new Locale("fn");
		System.out.println(applicationContext.getMessage("msg", null, french));
	}

}