package com.ashwani.spring.springResourceExample;

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
    	 AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	 Application bean = context.getBean(Application.class);
         System.out.println(bean);
         context.close();
    }
}
