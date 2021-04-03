package com.learnDev.springDI;

public class anotherStudent {

	private Studybook book1;

	public void setBook1(Studybook book1) {
		this.book1 = book1;
	}
	
	public void startStudying() {
		  book1.readBook();
		  System.out.println("Class anotherStudent preparing");
	}
}