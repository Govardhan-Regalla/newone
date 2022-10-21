package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/collection/Config.xml");
		//ApplicationContext context=new ClassPathXmlApplicationContext("com/collection/Constr.xml");
		Project st=(Project)context.getBean("s");
		//System.out.println(st);
		//st.toString();
		st.show();

	}

}
