package com.cms.adminfunctions;

import java.util.Scanner;

import com.cms.batch.CreateBatch;
import com.cms.batch.viewBatch;
import com.cms.course.CreateCourse;
import com.cms.course.viewCourse;
import com.cms.courseplan.CreateCoursePlan;
import com.cms.facultyfunctions.ViewCoursePlan;

public class AdminOptions {
	
	public static void adminFunctions() {
		
		Scanner sc=  new Scanner(System.in);
		System.out.println("Welcome to Admin Portal");
		System.out.println("=========================");
		System.out.println("Optios:     Menu");
		System.out.println("  1   :     Admin Login");
		
		System.out.println("  2   :     Create Faculty");
		System.out.println("  3   :     Create Course");
		System.out.println("  4   :     Create Course Plan");
		System.out.println("  5   :     Create Batch");
		
		System.out.println("  6   :     Update Faculty");
		System.out.println("  7   :     Update Course");
		System.out.println("  8   :     Update Course Plan");
		System.out.println("  9   :     Update Batch");
		
		System.out.println("  10   :    View Faculty");
		System.out.println("  11   :    View Course");
		System.out.println("  12   :    View Course Plan");
		System.out.println("  13   :    View Batch");
		
		System.out.println("  14   :     Allocate Faculty to a Batch");
		
		System.out.println("  15   :     View daywise update  of a batch");
		
		System.out.println("  16   :     Generate report for every batch");
		
		
		System.out.println("Enter Your Selection");
		int option = sc.nextInt();
		
		
		
		switch (option) {
		case 1: {
			AdminLogin.Login();
			break;
		}
		case 2:{
			CreateFaculty.addfaculty();
			break;
		}
		case 3:{
			CreateCourse.addcourse();
			break;
		}
		case 4:{
			CreateCoursePlan.addCoursePlan();
			break;
		}
		case 5:{
			CreateBatch.addBatch();
			break;
		}
		case 6:{
			break;
		}
		case 7:{
			break;
		}
		case 8:{
			break;
		}
		case 9:{
			break;
		}
		case 10:{
			ViewFaculty.getFacultyList();
			break;
		}
		case 11:{
			viewCourse.getCourseList();
			break;
		}
		case 12:{
			ViewCoursePlan.coursePlan();
			break;
		}
		case 13:{
			viewBatch.getBatchList();
			break;
		}
		case 14:{
			break;
		}
		case 15:{
			break;
		}
		case 16:{
			break;
		}
		default:
			System.out.println("Invalid Selection");
		}
		
		
		
		
	}

}
