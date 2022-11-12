package com.cms.course;

import java.util.List;
import java.util.Scanner;

import com.cms.Exception.CourseException;
import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;
import com.cms.adminfunctions.AdminOptions;
import com.cms.frontend.Main;
import com.cms.models.Course;
import com.cms.models.Faculty;

public class ViewCourse {

	public static void getCourseList() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Course List");
		System.out.println("================");
		AdminUtil adUtil = new AdminUtilImpl();
		List<Course> list;
		try {
			list = adUtil.viewCourseList();
			list.forEach(s->System.out.println(s));
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
