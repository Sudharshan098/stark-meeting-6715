package com.cms.adminfunctions;

import java.util.Scanner;

import com.cms.Exception.FacultyException;
import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;
import com.cms.frontend.Main;

public class UpdateFacultyAddress {
	
	public static void changeAddress() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Update Faculty Address");
		System.out.println("======================");
		System.out.println();
		
		System.out.println("Enter Faculty ID : ");
		int id =sc.nextInt();
		System.out.println("Enter New Address :");
		String address= sc.next();
		
		
		AdminUtil adu=new AdminUtilImpl();
		
		String result;
		try {
			result = adu.updateFacAddress(id, address);
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
