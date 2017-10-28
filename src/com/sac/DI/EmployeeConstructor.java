package com.sac.DI;

public class EmployeeConstructor {
	private int id;
	private String name;
	

	public EmployeeConstructor() {
		System.out.println("def cons");
	}

	public EmployeeConstructor(int id) {
		this.id = id;
	}

	public EmployeeConstructor(String name) {
		this.name = name;
	}

	public EmployeeConstructor(int id, String name) {
		this.id = id;
		this.name = name;
	}


	

	void show() {
		System.out.println(id + " " + name);
	}
}