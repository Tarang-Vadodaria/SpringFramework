package com.learnDev.springIOC;

public class Vodafone implements sim{

	@Override
	public void calling() {
		System.out.println("Calling from Vodafone");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing from Vodafone");
		
	}

}
