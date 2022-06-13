package com.tnsdi1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.di.Students;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		
		Student1 s1=a.getBean("s1",Student1.class);
		s1.cheating();
		
		AnotherStudent  s2=a.getBean("s2",AnotherStudent .class);
		s2.cheating();

	}

	}