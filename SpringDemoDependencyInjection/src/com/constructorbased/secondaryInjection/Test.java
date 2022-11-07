package com.constructorbased.secondaryInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/constructorbased/secondaryInjection/NewFile.xml");
		
		Library library = apc.getBean("l", Library.class);
		System.out.println(library);
	}

}
