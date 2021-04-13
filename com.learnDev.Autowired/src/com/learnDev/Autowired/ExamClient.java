package com.learnDev.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student Student1 = (Student) context.getBean("Student1", Student.class);
		Student1.startCopying();
		
	}
}
