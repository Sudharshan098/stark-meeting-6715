package com.cms.course;

import java.util.Scanner;

import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;
import com.cms.models.Course;
import com.cms.models.Faculty;

public class CreateCourse {
	public static void addcourse() {
		Scanner sc= new Scanner(System.in);
		
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
		
		String result= adu.addCourse(course);
		
		System.out.println(result);
		
		
	}
}
