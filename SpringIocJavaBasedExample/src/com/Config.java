package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

	@Bean(name = "stu")
	//@Scope(value = "singleton")
	@Scope(value = "prototype")
	public Student s() {
		
		Student s = new Student();
	    Scanner sc =new Scanner(System.in);
	    System.out.println("Enter student id  : ");
	    s.setSid(sc.nextInt());
	    System.out.println("Enter Student Name : ");
	    s.setSname(sc.next());
	    
	    return s;
	}
	
	@Bean
	public List<Student> slist() {
		Student s = new Student();
		s.setSid(123);
		s.setSname("Qwerty");
		
		Student s1 = new Student();
		s1.setSid(23);
		s1.setSname("Anonymous");
		List<Student> l = new ArrayList<Student>();
		l.add(s);l.add(s1);
		
		return l;
	}
}
