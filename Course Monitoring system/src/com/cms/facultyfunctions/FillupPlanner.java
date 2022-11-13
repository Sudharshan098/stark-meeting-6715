package com.cms.facultyfunctions;

import java.util.Scanner;

import com.cms.Exception.CoursePlanException;
import com.cms.faculty.FacultyUtil;
import com.cms.faculty.FacultyUtilImpl;
import com.cms.frontend.Main;
import com.cms.models.CoursePlan;

public class FillupPlanner {
	
	public static void dayWisePlanner() {
		
		
		 
		System.out.println("Fillup Daily Planner");
		System.out.println("====================");
		System.out.println();
			
			 Scanner sc=new Scanner(System.in);
			 
			 System.out.println("Enter Batch Id ");
			 int batchId= sc.nextInt();
			 
			 System.out.println("Enter Day Number");
			 int dayNumber= sc.nextInt();
			 
			 System.out.println("Enter topic");
			 String topic= sc.next();
			 
			 System.out.println("Enter status : Completed / Pending");
			 String status= sc.next();
			 
			
			 CoursePlan cp= new CoursePlan(batchId, dayNumber, topic, status);
			 FacultyUtil ad=new FacultyUtilImpl();
			 String result;
			 System.out.println();

			try {
				result = ad.fillupPlanner(cp);
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
