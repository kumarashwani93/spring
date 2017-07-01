package com.ashwani.spring.springResourceExample;

import org.springframework.stereotype.Component;

@Component("applicationUser")
public class ApplicationUser {
	private String name = "default name" ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ApplicationUser [name=" + name + "]";
	}
	
	
 
}
