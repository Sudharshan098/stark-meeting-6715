package com.cms.facultyfunctions;

import java.util.Scanner;

import com.cms.Exception.FacultyException;
import com.cms.faculty.FacultyUtil;
import com.cms.faculty.FacultyUtilImpl;
import com.cms.frontend.Main;

public class FacultyLogin {
	
	public static void Login() {
		
		 Scanner sc=new Scanner(System.in);
		 
			System.out.println("Faculty Login");
			System.out.println("=============");
			System.out.println();
			
		 System.out.println("Enter Faculty Username");
		 String username= sc.next();
		 
		 System.out.println("Enter Password");
		 String password= sc.next();
		 
		
		 String str="";
		 FacultyUtil ad=new FacultyUtilImpl();
		 try {
			ad.facultyLogin(username, password);

		} catch (FacultyException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
