package com.ashwani.spring.springQualifierExample;

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
       CarUser bean = context.getBean(CarUser.class);
       bean.showCar();
       context.close();
    }
}
