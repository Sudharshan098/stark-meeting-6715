package com.cms.facultyfunctions;

import java.util.Scanner;

import com.cms.Exception.CoursePlanException;
import com.cms.faculty.FacultyUtil;
import com.cms.faculty.FacultyUtilImpl;
import com.cms.frontend.Main;
import com.cms.models.CoursePlan;

public class UpdateCoursePlanStatus {
	
	
	public static void changeCoursePlanStatus() {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Change Course Plan Status");
		System.out.println("=========================");
		System.out.println();
			
		 
		 System.out.println("Enter Plan Id ");
		 int id= sc.nextInt();
		 
		 
		 System.out.println("Enter Status : Completed / Pending ");
		 String stat = sc.next();
		
		 FacultyUtil ad=new FacultyUtilImpl();
		 String result;
		 System.out.println();

		try {
			result = ad.updateCourseplanStatus(id, stat);
			 System.out.println(result);

		} catch (CoursePlanException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		 
		System.out.println("Enter 1 to redirect you to the Main Portal");
		
		System.out.println("Enter 2 to redirect you to the Faculty Portal");

		int ans=sc.nextInt();
		if(ans==1) {
			Main.main(null);
		}
		else if(ans==2) {
			FacultyOptions.facultyFunctions();

		}
		else { 
			System.out.println("Invalid Selection..........");
		}
		

	

		
	}

}
