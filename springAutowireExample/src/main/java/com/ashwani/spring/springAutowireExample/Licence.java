package com.ashwani.spring.springAutowireExample;

import org.springframework.stereotype.Component;

@Component
public class Licence {
	
	private String number = "abc";

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Licence [number=" + number + "]";
	}
	
	
	
	

}
