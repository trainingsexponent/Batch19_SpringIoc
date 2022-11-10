package com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc =new AnnotationConfigApplicationContext(Config.class);

		Student student = apc.getBean("stu",Student.class);

		System.out.println(student);
		System.out.println(student.hashCode());
		System.out.println("--------------------------------------");
		
		Student student1 = apc.getBean("stu",Student.class);

		System.out.println(student1);
		System.out.println(student1.hashCode());
		
		System.out.println("=================================================");
		
		List<Student> l1 =  apc.getBean("slist",List.class);
		System.out.println(l1);
	}
}
