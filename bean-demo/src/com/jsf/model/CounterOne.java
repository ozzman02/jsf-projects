package com.jsf.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * Bean is created once for user's browser session. Unique for this user.
 */
@ManagedBean
@SessionScoped 
public class CounterOne {

	private int value = 0;
	
	public String increment() {
		value++;
		
		return "counter_one";
	}

	public CounterOne() {
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	
}
