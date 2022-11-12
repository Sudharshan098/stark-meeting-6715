package com.cms.adminfunctions;

import java.util.Scanner;

import com.cms.Exception.BatchException;
import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;
import com.cms.frontend.Main;

public class ChangeFacFromBatch {
	
	public static void swapFaculty() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Changing a Faculty");
		System.out.println("==================");
		System.out.println();
		
		
		System.out.println("Enter Batch ID : ");
		int batchId =sc.nextInt();
		System.out.println("Enter New Faculty ID :");
		int newId =sc.nextInt();
		
		
		AdminUtil adu=new AdminUtilImpl();
		
		String result;
		try {
			result = adu.changeFacFromBatch(batchId, newId);
			System.out.println(result);
			 System.out.println();

		} catch (BatchException e) {
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
