package com.school.app;

import java.util.ArrayList;
import java.util.Scanner;

//import com.school.app.models.Employee;
//import com.school.app.models.Person;
import com.school.app.models.Test;



public class Main {
	public static void main(String[] args) {
		
		
		int input;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Menu");
			
			System.out.println("1 - Add New Employee");
			System.out.println("2 - Delete tests");
			System.out.println("4 - Exit");
			
			System.out.println("Enter a number :");
			
			input = scanner.nextInt();
			
			switch (input) {
				case 1 :
					Test.AddInfo();
					break;
				case 2 : 
					Test.DeleteInfo();
					break;
				default :
					System.out.println("Program is Stoped");
			}
		} while (input != 4);
	}
}
