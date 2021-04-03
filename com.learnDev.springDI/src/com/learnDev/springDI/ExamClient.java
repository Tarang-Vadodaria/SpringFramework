package com.learnDev.springDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamClient {

	public static void main(String[] args) {
		
	
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	Student stu1 = context.getBean("stud1",Student.class);
	stu1.startStudying();
	anotherStudent stu2 = context.getBean("stud2",anotherStudent.class);
	stu2.startStudying();
}

}