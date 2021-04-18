package com.learnDev.annotationConfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathTeacher implements Teacher {

	public void teach()
	{
		System.out.println("I am your math teacher");
	}
}
