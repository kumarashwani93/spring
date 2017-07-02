package com.ashwani.spring.springAutowireExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("driver")
public class Driver {

	//Autowire over a field
	@Autowired
	private Licence licence;

	public Licence getLicence() {
		return licence;
	}

	public void setLicence(Licence licence) {
		this.licence = licence;
	}

	@Override
	public String toString() {
		return "Driver [licence=" + licence + "]";
	}

}
