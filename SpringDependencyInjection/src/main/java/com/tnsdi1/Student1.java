package com.tnsdi1;

public class Student1 {
	
	//Dependency in objects
	Cheat c;
	
	
	public void setC(Cheat c) {
		this.c = c;
	}
	public void cheating() {
		// TODO Auto-generated method stub
		c.mathCheat2();
	}
}