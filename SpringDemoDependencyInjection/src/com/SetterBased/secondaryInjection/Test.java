package com.SetterBased.secondaryInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/SetterBased/secondaryInjection/NewFile.xml");
	
	    Employee employee = apc.getBean("e",Employee.class);
	    
	    System.out.println(employee);
	}

}
