package com.cms.courseplan;

import java.util.Scanner;

import com.cms.Exception.CoursePlanException;
import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;
import com.cms.adminfunctions.AdminOptions;
import com.cms.frontend.Main;
import com.cms.models.Course;
import com.cms.models.CoursePlan;

public class CreateCoursePlan {

	public static void addCoursePlan() {
		Scanner sc= new Scanner(System.in);

		
		System.out.println("Creating a New CoursePlan");
		System.out.println("=========================");
		System.out.println(); 
		
		
		System.out.println("Enter Plan Id : ");
		int planId = sc.nextInt();
		
		
		System.out.println("Enter Batch Id : ");
		int batchId = sc.nextInt();
		
		System.out.println("Enter Day Number :");
		int dayNumber = sc.nextInt(); 

		System.out.println("Enter topics");
		String desc=sc.next();
		
		System.out.println("Enter status");
		String stat=sc.next();
		
		

		
		CoursePlan courseplan=new CoursePlan(planId, batchId, dayNumber, desc, stat);
		
		AdminUtil adu=new AdminUtilImpl();
		
		String result;
		try {
			result = adu.addCoursePlan(courseplan);
			System.out.println(result);
			 System.out.println();


		} catch (CoursePlanException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Enter 1 to redirect you to the Main Portal");
		
		System.out.println("Enter 2 to redirect you to the Admin Portal");

		int ans=sc.nextInt();
		if(ans==1) {
			Main.main(null);
		}
		else if(ans==2) {
			AdminOptions.adminFunctions();
		}
		else { 
			System.out.println("Invalid Selection..........");
		}		
}
}
