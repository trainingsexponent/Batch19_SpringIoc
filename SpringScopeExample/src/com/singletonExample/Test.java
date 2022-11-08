package com.singletonExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc =  new ClassPathXmlApplicationContext("com/singletonExample/NewFile.xml");

		Login login = apc.getBean("l",Login.class);

		System.out.println(login.hashCode());

		System.out.println("-----------------------------------");
		
		Login login1 = apc.getBean("l",Login.class);

		System.out.println(login1.hashCode());
		
		System.out.println("=======================================================");
		
		Login login2 = apc.getBean("l1",Login.class);

		System.out.println(login2.hashCode());

		System.out.println("-----------------------------------");
		
		Login login3 = apc.getBean("l1",Login.class);

		System.out.println(login3.hashCode());
	}

}
