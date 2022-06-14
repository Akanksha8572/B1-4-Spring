package com.tns.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Body {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");

		Human h=a.getBean("human",Human.class);
		h.display();

	}

}