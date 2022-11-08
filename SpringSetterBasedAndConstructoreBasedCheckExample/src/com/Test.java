package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/NewFile.xml");
		
		Company company = apc.getBean("c",Company.class);
		System.out.println(company);
	}
}
