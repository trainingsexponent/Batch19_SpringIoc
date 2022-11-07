package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("NewFile.xml");

		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Connection con = beanFactory.getBean("m", Connection.class);


		con.conON(); 
		con.conOFF();

		System.out.println("----------------------------------------");

		con = beanFactory.getBean("o", Connection.class);

		con.conON(); 
		con.conOFF();

		System.out.println("================================================");

		ApplicationContext apc = new ClassPathXmlApplicationContext("NewFile.xml");

		Mysql c = (Mysql) apc.getBean("m", Connection.class); 
		c.conON(); 
		c.conOFF();
	}
}
