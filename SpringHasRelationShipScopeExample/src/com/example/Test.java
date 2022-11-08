package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("NewFile.xml"); 
		
		Student student = apc.getBean("s",Student.class);
		System.out.println(student.hashCode());
		System.out.println(student.getBatch().hashCode());
		
		System.out.println("------------------------------------------------------");
		
		Student student1 = apc.getBean("s",Student.class);
		System.out.println(student1.hashCode());
		System.out.println(student1.getBatch().hashCode());
	}
}
