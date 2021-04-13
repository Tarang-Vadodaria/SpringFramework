package com.learnDev.loadingfromproperties;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	private String name;
	private String interestedCourse;
	private String hobby;
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	@Value("${student.interestedCourse}")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public void displayInfo() {
		System.out.println(" Student name is "+ name +
				" interested course is " + interestedCourse +
				" hobby is " + hobby);
	}
}
