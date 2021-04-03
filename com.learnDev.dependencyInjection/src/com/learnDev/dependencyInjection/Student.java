package com.learnDev.dependencyInjection;

public class Student {
 private String name;
 private int id;
 public void setName(String name) {
	this.name = name;
}
public void setId(int id) {
	this.id = id;
}
;

public Student(String name, int id) {
	this.name = name;
	this.id = id;
}

void displayStudentInfo() {
	System.out.println(" student name is :" + name +"\n student id is :" + id);
}
}
