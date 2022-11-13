package com.cms.facultyfunctions;

import java.util.Scanner;

import com.cms.Exception.FacultyException;
import com.cms.adminfunctions.AdminOptions;
import com.cms.faculty.FacultyUtil;
import com.cms.faculty.FacultyUtilImpl;
import com.cms.frontend.Main;

public class ChangePassword {
	
	public static void resetPassword() {
		
		 Scanner sc=new Scanner(System.in);
		 
			System.out.println("Change Password");
			System.out.println("===============");
			System.out.println();
		 
		 System.out.println("Enter Faculty Username");
		 String username= sc.next();
		 
		 System.out.println("Enter Password");
		 String password= sc.next();
		 
		 System.out.println("Enter your New Password");
		 String newPassword= sc.next();
		 
		 FacultyUtil ad=new FacultyUtilImpl();
		 String str;
		try {
			str = ad.changePassword(username, password, newPassword);
			 System.out.println(str);
			 System.out.println();
		} catch (FacultyException e) {
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
