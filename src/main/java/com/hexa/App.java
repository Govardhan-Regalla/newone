package com.hexa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/hexa/refconfig.xml");
		Student st=(Student)context.getBean("s");
		System.out.println(st);
		
	}

}
