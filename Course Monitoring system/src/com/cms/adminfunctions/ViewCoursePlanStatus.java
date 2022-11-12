package com.cms.adminfunctions;

import java.util.List;
import java.util.Scanner;

import com.cms.Exception.CoursePlanException;
import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;
import com.cms.frontend.Main;
import com.cms.models.CoursePlan;

public class ViewCoursePlanStatus {
	
	
	public static void viewPlanList() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Check Course Plan Status");
		System.out.println("========================");
		System.out.println();
		
		System.out.println("Enter Plan ID : ");
		int id =sc.nextInt();
		
		AdminUtil adu=new AdminUtilImpl();
		
		List<CoursePlan> list;
		try {
			list = adu.viewCoursePlanStatus(id);
			list.forEach(s->System.out.println(s));
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
