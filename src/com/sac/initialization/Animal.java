package com.sac.initialization;

public class Animal {
	private String name;

	public Animal() {
		System.out.println("Animals are initialized");
	}

	public void init() {
		System.out.println("Inside init method");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void destroy() {
		System.out.println("Inside destroy method");
	}
}