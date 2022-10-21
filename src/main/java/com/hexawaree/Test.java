package com.hexawaree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/hexawaree/ciconfig.xml");
	Student st =(Student)context.getBean("student1");
	System.out.println(st);

	}

}
