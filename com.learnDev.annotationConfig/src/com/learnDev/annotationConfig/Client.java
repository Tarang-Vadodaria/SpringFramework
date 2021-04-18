package com.learnDev.annotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		College college = context.getBean("college",College.class);
		System.out.println("collge object created by spring is " + college);
		college.test();
		college.teach();
		((AnnotationConfigApplicationContext)context).close();
	}
}
