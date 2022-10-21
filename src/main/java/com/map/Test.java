package com.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//ApplicationContext con = new ClassPathXmlApplicationContext("com/map/Constr.xml");
		ApplicationContext con = new ClassPathXmlApplicationContext("com/map/Config.xml");
		Student st=(Student) con.getBean("s");
		//System.out.println(st);
		//st.toString();
		st.show();
		

	}

}
