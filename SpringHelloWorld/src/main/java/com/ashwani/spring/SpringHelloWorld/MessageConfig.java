package com.ashwani.spring.SpringHelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
public class MessageConfig {

	@Bean(name = "messageBean")
	@Description("Hello world Example")
	public Message message() {
		return new MessageImpl();
	}
}
