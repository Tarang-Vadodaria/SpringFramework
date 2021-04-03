package com.learnDev.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
 public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	 Student stud = context.getBean("student",Student.class);
	 stud.displayStudentInfo();
	 ((ClassPathXmlApplicationContext)context).close();
}
 
}
