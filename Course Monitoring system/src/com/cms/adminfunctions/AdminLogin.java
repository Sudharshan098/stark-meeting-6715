package com.cms.adminfunctions;

import java.util.Scanner;

import com.cms.Exception.AdminException;
import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;

public class AdminLogin {

	public static void Login() {
		
		 Scanner sc=new Scanner(System.in);
		 
			System.out.println("Adminstartor Login");
			System.out.println("==================");
			System.out.println();
		 
		 System.out.println("Enter Admin Username");
		 String username= sc.next();
		 
		 System.out.println("Enter Password");
		 String password= sc.next();
		 
		
		 AdminUtil ad=new AdminUtilImpl();
		 try {
			ad.adminLogin(username, password);
			 System.out.println();
		} catch (AdminException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		 
		 
	}

}
