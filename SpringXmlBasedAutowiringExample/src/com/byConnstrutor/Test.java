package com.byConnstrutor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext apc =new ClassPathXmlApplicationContext("com/byConnstrutor/NewFile.xml");
	
	    University university = apc.getBean("u",University.class);
	    System.out.println(university);
	}
}
