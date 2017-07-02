package com.ashwani.spring.springAutowireExample;

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
        Driver driverBean = context.getBean(Driver.class);
        System.out.println(driverBean);
        Customer customerBean = (Customer)context.getBean("customer");
        System.out.println(customerBean);
        Employee employeeBean = context.getBean(Employee.class);
        System.out.println(employeeBean);
        context.close();
    }
}
