package com.cms.adminfunctions;

import java.util.Scanner;

import com.cms.Exception.BatchException;
import com.cms.Exception.FacultyException;
import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;
import com.cms.frontend.Main;

public class FacultyAllocation {
	
	public static void allocateFacultyToBatch() {
		
		
		System.out.println("Allocating Faculty to a Batch");
		System.out.println("=============================");
		System.out.println();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Faculty Id :");
		int facId=sc.nextInt();
		System.out.println("Enter Batch Id :");
		int batchId=sc.nextInt();
		
		
		AdminUtil adu=new AdminUtilImpl();
		String result;
		try {
			result = adu.allocatefaculty(facId, batchId);
			System.out.println(result);
			 System.out.println();

		} catch (BatchException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
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
