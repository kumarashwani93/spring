package com.ashwani.spring.springAutowireExample;

import org.springframework.stereotype.Component;

@Component("id")
public class ID {

	private String idNumber = "123456";

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	@Override
	public String toString() {
		return "ID [idNumber=" + idNumber + "]";
	}
	
	
}
