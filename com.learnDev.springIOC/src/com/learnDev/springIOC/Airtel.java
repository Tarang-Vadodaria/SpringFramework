package com.learnDev.springIOC;

public class Airtel implements sim {

	@Override
	public void calling() {
		System.out.println("Calling from Airtel");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing from Airtel");
		
	}

}
