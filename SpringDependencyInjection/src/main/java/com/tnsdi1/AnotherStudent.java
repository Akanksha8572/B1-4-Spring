package com.tnsdi1;

public class AnotherStudent {
	//Dependency in objects
	Cheat c;
	//setters method for DI
	public void setC(Cheat c) {
		this.c = c;
	}

	public void cheating()
	{
		c.mathCheat2();
	}
			
}