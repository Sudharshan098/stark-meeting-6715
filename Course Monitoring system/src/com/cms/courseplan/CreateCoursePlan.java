package com.cms.courseplan;

import java.util.Scanner;

import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;
import com.cms.models.Course;
import com.cms.models.CoursePlan;

public class CreateCoursePlan {

	public static void addCoursePlan() {
		Scanner sc= new Scanner(System.in);
		
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
		
		String result= adu.addCoursePlan(courseplan);
		
		System.out.println(result);
}
}
