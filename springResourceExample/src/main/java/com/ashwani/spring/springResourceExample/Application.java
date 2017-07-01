package com.ashwani.spring.springResourceExample;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Application {

	@Resource(name="applicationUser")
	private ApplicationUser user;

	public ApplicationUser getUser() {
		return user;
	}

	public void setUser(ApplicationUser user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "System [user=" + user + "]";
	}
	
}
