package com.cms.adminfunctions;

import java.util.Scanner;

import com.cms.Exception.CourseException;
import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;
import com.cms.frontend.Main;

public class UpdateCourseFees {
	
	public static void courseFeesUpdate() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Update Course Fees");
		System.out.println("======================");
		System.out.println();
		
		System.out.println("Enter Course ID : ");
		int id =sc.nextInt();
		System.out.println("Enter Fees :");
		int fees= sc.nextInt();
		
		
		AdminUtil adu=new AdminUtilImpl();
		
		String result;
		try {
			result = adu.updateCourseFees(id, fees);
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
