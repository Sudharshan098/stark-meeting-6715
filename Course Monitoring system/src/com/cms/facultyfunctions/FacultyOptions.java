package com.cms.facultyfunctions;

import java.util.Scanner;

import com.cms.frontend.Main;

public class FacultyOptions {
	
	public static void facultyFunctions() {
		
		Scanner sc=  new Scanner(System.in);
		System.out.println("Welcome to Faculty Portal");
		System.out.println("=========================");
		System.out.println();
		System.out.println("Optios:     Menu");
		System.out.println("  1   :     View Course Plan");
		System.out.println("  2   :     Fillup daywise planner");
		System.out.println("  3   :     Update Planner Status");
		System.out.println("  4   :     Change password");
		System.out.println("  5   :     Exit");

		System.out.println();
		System.out.println("Enter Your Selection");
		int option = sc.nextInt();
		
		
		
		switch (option) {
		
		case 1:{
			ViewCoursePlan.coursePlan();
			break;
		}
		case 2:{
			FillupPlanner.dayWisePlanner();
			break;
		}
		case 3:{
			UpdateCoursePlanStatus.changeCoursePlanStatus();
			break;
		}
		case 4:{
			ChangePassword.resetPassword();
			break;
		}
		case 5:{
			System.out.println("Thank You For Visting");
			break;
		}
		default:
			System.out.println("Invalid Selection");
			facultyFunctions();
		}
		
		

		
	}

}
