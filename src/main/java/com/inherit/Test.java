package com.inherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con= new ClassPathXmlApplicationContext("com/inherit/Config.xml");
		Student stu=(Student) con.getBean("st");
		stu.toString();
		System.out.println(stu);

	}

}
