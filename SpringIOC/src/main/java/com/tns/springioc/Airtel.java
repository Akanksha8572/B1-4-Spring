package com.tns.springioc;

public class Airtel implements Sim
{
	

	public Airtel() {
		super();
		System.out.println("Airtel class constructor");
	}

	public void calling() {
		System.out.println("calling using Airtel Sim");
		
	}

	public void data() {
		System.out.println("data using Airtel Sim"); 
		
	}

}
