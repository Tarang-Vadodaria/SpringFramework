package com.learnDev.springIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mobile {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		sim mobileSim = context.getBean("sim",Airtel.class);
		mobileSim.calling();
		mobileSim.data();
		
	}
	
	
	
	
}
