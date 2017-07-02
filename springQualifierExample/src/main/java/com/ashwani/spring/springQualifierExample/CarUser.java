package com.ashwani.spring.springQualifierExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CarUser {
	@Autowired
	@Qualifier("Honda")
	private Car car;
	
	public void showCar(){
		car.getCarName();
	}
}
