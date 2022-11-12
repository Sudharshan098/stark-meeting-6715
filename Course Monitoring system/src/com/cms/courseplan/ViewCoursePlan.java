package com.cms.courseplan;

import java.util.List;
import java.util.Scanner;

import com.cms.Exception.CoursePlanException;
import com.cms.adminfunctions.AdminOptions;
import com.cms.faculty.FacultyUtil;
import com.cms.faculty.FacultyUtilImpl;
import com.cms.frontend.Main;
import com.cms.models.CoursePlan;

public class ViewCoursePlan {	
	
	public static void AdmincoursePlan() {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Course Plan List");
		System.out.println("================");
		
		FacultyUtil fu = new FacultyUtilImpl();
		
		List<CoursePlan> list;
		try {
			list = fu.viewCoursePlan();
			list.forEach(s->System.out.println(s));
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
