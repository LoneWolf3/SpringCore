package com.sac.bean.reference;

public class Address {
	private String city = null;
	private String country = null;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "City : " + city + ", Country" + country;
	}
}