package com.cms.adminfunctions;

import java.util.Scanner;

import com.cms.Exception.FacultyException;
import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;
import com.cms.frontend.Main;
import com.cms.models.Faculty;

public class CreateFaculty {
	
	public static void addfaculty() {
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Creating a new Faculty");
		System.out.println("======================");
		System.out.println();
		
		System.out.println("Enter faculty Id");
		int id = sc.nextInt();
		
		
		System.out.println("Enter faculty name");
		String name=sc.next();
		
		System.out.println("Enter faculty address");
		String address=sc.next();

		System.out.println("Enter faculty mobile");
		String mobile=sc.next();
		
		System.out.println("Enter faculty email");
		String email=sc.next();

		System.out.println("Enter faculty username");
		String username=sc.next();

		System.out.println("Enter faculty password");
		String password=sc.next();

		
		Faculty fac=new Faculty(id, name, address, mobile, email, username, password);
		
		AdminUtil adu=new AdminUtilImpl();
		
		String result;
		try {
			result = adu.addFaculty(fac);
			System.out.println(result);
			 System.out.println();

		} catch (FacultyException e) {
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
