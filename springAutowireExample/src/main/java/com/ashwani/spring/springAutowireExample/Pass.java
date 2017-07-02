package com.ashwani.spring.springAutowireExample;

import org.springframework.stereotype.Component;

@Component("pass")
public class Pass {
	private String passNumber = "Pass123";

	public String getPassNumber() {
		return passNumber;
	}

	public void setPassNumber(String passNumber) {
		this.passNumber = passNumber;
	}

	@Override
	public String toString() {
		return "Pass [passNumber=" + passNumber + "]";
	}
	
}
