package com.cms.facultyfunctions;

import java.util.Scanner;
import com.cms.faculty.FacultyUtil;
import com.cms.faculty.FacultyUtilImpl;

public class FacultyLogin {
	
	public static void Login() {
		
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter Faculty Username");
		 String username= sc.next();
		 
		 System.out.println("Enter Password");
		 String password= sc.next();
		 
		
		 String str="";
		 FacultyUtil ad=new FacultyUtilImpl();
		 str=ad.facultyLogin(username, password);
		 System.out.println(str);
	}

}
