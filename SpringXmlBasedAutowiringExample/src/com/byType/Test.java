package com.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/byType/byType.xml");
		Employee employee = apc.getBean("e",Employee.class);
		System.out.println(employee);
	}
}
