package com.sac.DI;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeSetter {

	private String name;
	private int age;
	private String country;
	private List<Object> suffixes;

	private Map suffixes2;

	public void getSuffixes2() {
		Set s = suffixes2.entrySet();
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey() + " - " + me.getValue());
		}
	}

	public void setSuffixes2(Map suffixes2) {
		this.suffixes2 = suffixes2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setSuffixes(List<Object> suffixes) {
		this.suffixes = suffixes;
	}

	public synchronized String getSequence() {
		StringBuffer buffer = new StringBuffer();
		for (Object suffix : suffixes) {
			buffer.append("-");
			buffer.append(suffix);
		}
		return buffer.toString();
	}

	public String toString() {
		return name + " is " + age + " years old, living in " + country;
	}
}