
package com.sac.bean.reference;

public class Person {
	private String firstName = null;
	private String lastName = null;
	private Address address = null;

	public Person(Address a) {
		this.address = a;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public String getPersonDetail() {
		return "Name :" + getName() + "\n" + address.toString();
	}
}