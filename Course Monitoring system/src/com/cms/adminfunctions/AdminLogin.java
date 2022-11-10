package com.cms.adminfunctions;

import java.util.Scanner;

import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;

public class AdminLogin {

	public static void Login() {
		
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter Admin Username");
		 String username= sc.next();
		 
		 System.out.println("Enter Password");
		 String password= sc.next();
		 
		
		 String str="";
		 AdminUtil ad=new AdminUtilImpl();
		 str=ad.adminLogin(username, password);
		 System.out.println(str);
//		 AdminOptions.adminFunctions();
	}

}
