package com.learnDev.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	
	private int rollNo;
	
	@Value("10")
	@Required
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	private Mathcheat cheat;
	public Student(Mathcheat cheat) {
		
		this.cheat = cheat;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	/* 
	 * change qualifier to change object called for implementation
	 */
	@Autowired
	@Qualifier("mathCheatRef2")
	public void setCheat(Mathcheat cheat) {
		this.cheat = cheat;
	}

	void startCopying() {
		System.out.println("Called for roll number "+rollNo);
		cheat.cheating();
	}
}
