package com.cms.facultyfunctions;

import java.util.Scanner;

public class FacultyOptions {
	
	public static void facultyFunctions() {
		
		Scanner sc=  new Scanner(System.in);
		System.out.println("Welcome to Faculty Portal");
		System.out.println("=========================");
		System.out.println("Optios:     Menu");
		System.out.println("  1   :     Faculty Login");
		System.out.println("  2   :     View Course Plan");
		
		System.out.println("Enter Your Selection");
		int option = sc.nextInt();
		
		
		
		switch (option) {
		case 1: {
			FacultyLogin.Login();
			break;
		}
		case 2:{
			ViewCoursePlan.coursePlan();
			break;
		}
		default:
			System.out.println("Invalid Selection");
		}
		
		
		
		
	}

}
