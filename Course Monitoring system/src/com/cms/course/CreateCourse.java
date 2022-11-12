package com.cms.course;

import java.util.Scanner;

import com.cms.Exception.CourseException;
import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;
import com.cms.adminfunctions.AdminOptions;
import com.cms.frontend.Main;
import com.cms.models.Course;
import com.cms.models.Faculty;

public class CreateCourse {
	public static void addcourse() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Creating a New Course");
		System.out.println("=====================");
		System.out.println();
		
		
		System.out.println("Enter Course Id");
		int id = sc.nextInt();
		
		
		System.out.println("Enter Course name");
		String name=sc.next();
		
		System.out.println("Enter Course fees");
		int fees = sc.nextInt();

		System.out.println("Enter Course Description");
		String desc=sc.next();
		
		

		
		Course course=new Course(id, name, fees, desc );
		
		AdminUtil adu=new AdminUtilImpl();
		
		String result;
		try {
			result = adu.addCourse(course);
			System.out.println(result);
			System.out.println();

		} catch (CourseException e) {
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
