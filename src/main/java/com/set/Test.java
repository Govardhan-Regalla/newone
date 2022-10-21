package com.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/set/Constr.xml");
		//ApplicationContext con = new ClassPathXmlApplicationContext("com/set/Config.xml");
		Student st=(Student) con.getBean("s");
		System.out.println(st);
		st.toString();
		
		

	}

}
