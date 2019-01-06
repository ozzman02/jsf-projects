package com.jsf.model;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped // shared by all users of the application
public class CounterTwo {

	private int value = 0;

	public String increment() {
		value++;
		
		return "student_two";
	}

	public CounterTwo() {
		
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
