package com.learnDev.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private Mathcheat cheat;
	public Student(Mathcheat cheat) {
		
		this.cheat = cheat;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * 
	 * change qualifier to change object called for implementation
	 */
	@Autowired
	@Qualifier("mathCheatRef2")
	public void setCheat(Mathcheat cheat) {
		this.cheat = cheat;
	}

	void startCopying() {
		cheat.cheating();
	}
}
