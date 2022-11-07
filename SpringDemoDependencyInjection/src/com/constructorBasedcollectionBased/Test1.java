package com.constructorBasedcollectionBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		
		ApplicationContext apc = new FileSystemXmlApplicationContext("E:\\NewFile.xml");
		
		Shopkeeper shopkeeper = (Shopkeeper) apc.getBean("s");
		System.out.println(shopkeeper);
		
	}
}
