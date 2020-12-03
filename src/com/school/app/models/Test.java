package com.school.app.models;

import java.util.ArrayList;
import java.util.Scanner;



public class Test {
	
	private int id;
	private String nom;
	private double salary;
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Object> listObj = new ArrayList<Object>();
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Test() {}
//	@Override
	
	public static void AddInfo() {
		
		Test emp = new Test();
		
		System.out.println("Enter Test Id");
		int empId = scanner.nextInt();
		emp.setId(empId);
		
		System.out.println("Enter Test Name");
		String empName = scanner.next();
		emp.setNom(empName);
		
		System.out.println("Enter Test Salary");
		double empSalary = scanner.nextDouble();
		emp.setSalary(empSalary);
		
		listObj.add(emp.getId()+" "+emp.getNom()+" "+emp.getSalary()+"\n");
		
		for(Object i : listObj) {
			System.out.println(i);
		}
	}
	public static void DeleteInfo() {
		System.out.println("enter the row number to delete");
		int testdeleteId = scanner.nextInt();
		listObj.remove(testdeleteId);
		
		for(Object i : listObj) {
			System.out.println(i);
		}
	}
}