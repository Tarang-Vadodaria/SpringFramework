package com.learnDev.annotationConfig;

//mport org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages = "com.learnDev.annotationConfig")
@PropertySource("classpath:college-info.properties")
public class AppConfig {
/*
	@Bean
	public Principal principalBean() {
		return new Principal();
	}
*/
	
/*
	@Bean
	public Teacher mathTeachBean() {
		return new MathTeacher();
	}
*/
/*
	@Bean(name = "colBean")
	public College collegeBean() { //method name is bean id
		//This is for constructor injection
		//College college = new College(principalBean());
		 
		College college = new College();
		college.setPrincipal(principalBean());
		college.setTeacher( mathTeachBean());
		return college;
		
	}
*/
}
