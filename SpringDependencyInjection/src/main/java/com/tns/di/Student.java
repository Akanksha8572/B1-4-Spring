package com.tns.di;

public class Student 
{
	private int id;
	private String StudentName;
	//constructor using injection		
	public Student(int id, String studentName) {
		super();
		this.id = id;
		StudentName = studentName;
	}


	//using setter injection
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	

	public void setId(int id) {
		this.id = id;
	}


	public void display()
	{
		System.out.println("Name of the student is:"+StudentName+" and ID is:"+id);
	}

}
