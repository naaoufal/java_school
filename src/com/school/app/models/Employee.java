package com.school.app.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee extends Person{
	private String salaire;
	static Scanner scanner = new Scanner(System.in);
	
	public String getSalaire() {
		return salaire;
	}
	public void setSalaire(String salaire) {
		this.salaire=salaire;
	}
	
	public Employee(int id ,String firstName,String lastName,String email,String salaire) {
		super (id , firstName, lastName, email);
		this.salaire = salaire;
	}
	
	public Employee() {
	}
	
	@Override
	public String toString() {
		return super.toString() + "Salaire : " + salaire;
	}
	
	public String addEmployee() {
		
		Employee emp = new Employee();
		ArrayList<Object> listOfEmployee = new ArrayList<>();
		
		System.out.println("Enter Employee ID");
		int empID = scanner.nextInt();
		emp.setId(empID);
		
		System.out.println("Enter Employee FirstName");
		String empFirstName = scanner.next();
		emp.setFirstName(empFirstName);
		
		System.out.println("Enter Employee LastName");
		String empLastName = scanner.next();
		emp.setLastName(empLastName);
		
		System.out.println("Enter Employee Email");
		String empEmail = scanner.next();
		emp.setEmail(empEmail);
		
		System.out.println("Enter Employee Salary");
		String empSalary = scanner.next();
		emp.setSalaire(empSalary);
		
		listOfEmployee.add("--------------------- employee list -------------------" + "\n" +
		"Employee ID : " + emp.getId() + "\n" + "Employee First Name : " + emp.getFirstName() + "\n" +
		"Employee Last Name : " + emp.getLastName() + "\n" + "Employee Email : " + emp.getEmail() + "\n" +
		"Employee Salary : " + emp.getSalaire() + "\n");
		
		return empSalary;
		
	}
	

	
}

