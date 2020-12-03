package com.school.app.models;

import java.util.ArrayList;

public class Person {
		private int id;
		private String firstName;
		private String lastName;
		private String email;
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id=id;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public void setFirstName(String firstName) {
			this.firstName=firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public void setLastName(String lastName) {
			this.lastName=lastName;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email=email;
		}
		
		public Person(int id ,String firstName,String lastName,String email) {
			this.id=id;
			this.firstName=firstName;
			this.lastName=lastName;
			this.email=email;
		}
		
		public Person() {
			
		}
		
		@Override
		public String toString() {
			return "id:"+ id + "\n Firstname:"+ firstName + "\n LastName:" + lastName + "\n Email:" + email;
		}
		
		public String addPerson(ArrayList<Person> listPerson, Person person) {
		try {
			listPerson.add(person);
			return "Person Added";
			
		}catch(Exception ex) {
			return ex.getMessage();
		}
			
		}
		
		public String editPerson(ArrayList<Person> listPerson, Person person, int index) {
		try {
			
			listPerson.set(index, person);
			return "Person Edited !";
			
		}catch(Exception ex) {
			return ex.getMessage();
			
		}
			
		}
		
		public String deletePerson(ArrayList<Person> listPerson, int index) {
		try {
			
			listPerson.remove(index);
			return "Person Removed !";
			
		}catch(Exception ex) {
			return ex.getMessage();
			
		}
			
		}
		public  String affichePerson(ArrayList<Person> listPerson) {
		try {
			String s="";
			for (Person person : listPerson) {
				s += person.toString();
			} 
			return s;
			 
			
		}catch(Exception ex) {
			return ex.getMessage();
			
		}
			
		}
}
