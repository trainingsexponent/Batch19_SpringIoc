package com.constructorBasedcollectionBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/constructorBasedcollectionBased/NewFile.xml");
		
		Shopkeeper shopkeeper =  (Shopkeeper) apc.getBean("s");
		
		System.out.println(shopkeeper);
		System.out.println(shopkeeper.getList());
		System.out.println(shopkeeper.getSet());
		System.out.println(shopkeeper.getMap());
	}

}
