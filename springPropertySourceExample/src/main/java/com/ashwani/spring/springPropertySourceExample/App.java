package com.ashwani.spring.springPropertySourceExample;

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
        FileService bean = (FileService)context.getBean("fileService");
        bean.getEnvDetails();
        context.close();
        
    }
}
