package com.ashwani.spring.springQualifierExample;

import org.springframework.stereotype.Component;

@Component("Honda")
public class Honda implements Car {

	public void getCarName() {
		System.out.println("Honda");

	}

}
