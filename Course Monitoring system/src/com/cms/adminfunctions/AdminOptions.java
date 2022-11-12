package com.cms.adminfunctions;

import java.util.Scanner;

import com.cms.batch.CreateBatch;
import com.cms.batch.ViewBatch;
import com.cms.course.CreateCourse;
import com.cms.course.ViewCourse;
import com.cms.courseplan.CreateCoursePlan;
import com.cms.facultyfunctions.ViewCoursePlan;

public class AdminOptions {
	
	public static void adminFunctions() {
		
		Scanner sc=  new Scanner(System.in);
		System.out.println("Welcome to Admin Portal");
		System.out.println("=========================");
		System.out.println("Options:     Menu");
		System.out.println();
		System.out.println("  1    :     Create Faculty");
		System.out.println("  2    :     Create Course");
		System.out.println("  3    :     Create Course Plan");
		System.out.println("  4    :     Create Batch ");
		System.out.println("  5    :     Update Faculty Address");
		System.out.println("  6    :     Update Course Fees");
		System.out.println("  7    :     View Course Plan Status");
		System.out.println("  8    :     Update Number of Students in Batch");
		System.out.println("  9    :     View Faculty");
		System.out.println("  10   :     View Course");
		System.out.println("  11   :     View Course Plan");
		System.out.println("  12   :     View Batch");
		System.out.println("  13   :     Allocate Faculty to a Batch");
		System.out.println("  14   :     View daywise update of a batch");
		System.out.println("  15   :     Generate report for every batch");
		System.out.println("  16   :     Change faculty from a batch");
		System.out.println("  17   :     Exit");

		

		


		System.out.println();
		System.out.println("                         Enter Your Selection                 ");
		int option = sc.nextInt();
		
		
			switch (option) {
			
			case 1:{
				CreateFaculty.addfaculty();
				break;
			}
			case 2:{
				CreateCourse.addcourse();
				break;
			}
			case 3:{
				CreateCoursePlan.addCoursePlan();
				break;
			}
			case 4:{
				CreateBatch.addBatch();
				break;
			}
			case 5:{
				UpdateFacultyAddress.changeAddress();
				break;
			}
			case 6:{
				UpdateCourseFees.courseFeesUpdate();
				break;
			}
			case 7:{
				ViewCoursePlanStatus.viewPlanList();
				break;
			}
			case 8:{
				UpdateStudentsCount.addSudents();
				break;
			}
			case 9:{
				ViewFaculty.getFacultyList();
				break;
			}
			case 10:{
				ViewCourse.getCourseList();
				break;
			}
			case 11:{
				com.cms.courseplan.ViewCoursePlan.AdmincoursePlan();
				break;
			}
			case 12:{
				ViewBatch.getBatchList();
				break;
			}
			case 13:{
				FacultyAllocation.allocateFacultyToBatch();
				break;
			}
			case 14:{
				ViewDaywiseUpdate.daywiseUpdate();
				break;
			}
			case 15:{
				GenerateReport.getReport();
				break;
			}
			case 16:{
				ChangeFacFromBatch.swapFaculty();
				break;
			}
			case 17:{
				System.out.println("Thank You For Visting");
				break;
			}
			default:
				System.out.println("Invalid Selection");
			}
			
		
		
		
		
		
		
		
	}

}
