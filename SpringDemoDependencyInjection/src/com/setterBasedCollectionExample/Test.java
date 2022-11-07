package com.setterBasedCollectionExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/setterBasedCollectionExample/NewFile.xml");
	   
		Amazon amazon = (Amazon) apc.getBean("a");
	
		System.out.println(amazon);
	}

}
