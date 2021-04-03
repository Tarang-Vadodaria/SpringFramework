package com.learnDev.springDI;

public class Student {

	private Studybook book2;

	public void setBook2(Studybook book2) {
		this.book2 = book2;
	}
	
	public void startStudying() {
		  book2.readBook();
		  System.out.println("Class student preparing");
	}
}
