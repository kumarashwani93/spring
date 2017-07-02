package com.ashwani.spring.springAutowireExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
	
	
	//autowire through Constructor
	@Autowired
	public Employee(ID employeeId) {
		super();
		this.employeeId = employeeId;
	}

	private ID employeeId;

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + "]";
	}
	
	
	
	
}
