package com.ashwani.spring.springQualifierExample;

import org.springframework.stereotype.Component;

@Component("Toyota")
public class Toyota implements Car {

	public void getCarName() {
		System.out.println("Toyota");
		
	}

}
