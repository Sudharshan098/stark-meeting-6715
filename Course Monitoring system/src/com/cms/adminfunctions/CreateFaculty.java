package com.cms.adminfunctions;

import java.util.Scanner;

import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;
import com.cms.models.Faculty;

public class CreateFaculty {
	
	public static void addfaculty() {
		Scanner sc= new Scanner(System.in);
		
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
		
		String result= adu.addFaculty(fac);
		
		System.out.println(result);
		
		
		
		
		
	}

}
