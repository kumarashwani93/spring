package com.ashwani.spring.SpringHelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
	
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
        MessageImpl messageBean = (MessageImpl)context.getBean("messageBean");
        messageBean.sayHi("World");
        context.close();
    }
}
