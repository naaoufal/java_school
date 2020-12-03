package com.school.app.models;

public class Student extends Person {
	private String studentCard;
		
	public String getStudentCard() {
		return studentCard;
	}
	
	public void setStudentCard(String studentCard) {
		this.studentCard=studentCard;
	}
	
	public Student(int id ,String firstName,String lastName,String email,String studentCard) {
		super(id , firstName, lastName, email);
		this.studentCard=studentCard;
	}
	
	public Student() {
		
	}
	@Override
	public String toString() {
		return super.toString()+ "StudentCard:" + studentCard;
	}
	
}
