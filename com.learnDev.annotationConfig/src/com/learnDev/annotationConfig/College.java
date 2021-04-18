package com.learnDev.annotationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/* can be replaced by method in configuration class
 * to define bean
 * default bean id is same as class name in lowercase
@Component("collegeBean")
 *
*/
@Component()
public class College {
	@Value("${college.name}")
	private String collegeName;
	private Principal principal;
	private Teacher teacher;
	
/*	
 * This is for constructor injection
	public College(Principal principal) {
		this.principal = principal;
	}
*/
	@Autowired
	@Qualifier("scienceTeacher")
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public void test() {
		
		System.out.println("this is a test method for  "+ collegeName);
		principal.pricipalInfo();
	}
	public void teach() {
		System.out.println("this is a teach method");
		teacher.teach();
	}
}
