package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext apc = new AnnotationConfigApplicationContext(Config.class); 
	
	    University university = (University)apc.getBean("u");

	    System.out.println(university);
	}
}
