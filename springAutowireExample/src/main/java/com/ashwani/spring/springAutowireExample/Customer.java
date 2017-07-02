package com.ashwani.spring.springAutowireExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {
	
	private Pass pass;

	public Pass getPass() {
		return pass;
	}
 //Autowired through setter
	@Autowired
	public void setPass(Pass pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Customer [pass=" + pass + "]";
	}
	
	
	
}
