package com.jsf.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped // bean is created once for user's browser session, unique for this user
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
