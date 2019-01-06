package com.jsf.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/*
 * New bean is created for every request. Short lived.
 */
@ManagedBean
@RequestScoped 
public class CounterThree {

	private int value = 0;

	/*
	 * It will be incremented only once. 
	 */
	public String increment() {
		value++;
		
		return "counter_three";
	}
	
	public CounterThree() {
		
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

		
}
