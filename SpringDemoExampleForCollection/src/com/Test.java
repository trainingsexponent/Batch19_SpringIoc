package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/NewFile.xml"); 
		
		College college = (College) apc.getBean("c");
		System.out.println(college);
		
	}

}
