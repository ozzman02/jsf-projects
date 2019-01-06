package com.jsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwo {
	
	private String firstName;
	
	private String lastName;
	
	private String country;

	public StudentTwo() {
	
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
