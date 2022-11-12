package com.cms.adminfunctions;

import java.util.List;
import java.util.Scanner;

import com.cms.Exception.FacultyException;
import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;
import com.cms.frontend.Main;
import com.cms.models.Faculty;

public class ViewFaculty {
	
	public static void getFacultyList() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Faculty List");
		System.out.println("============");
		AdminUtil adUtil = new AdminUtilImpl();
		List<Faculty> list;
		try {
			list = adUtil.viewFacultyList();
			list.forEach(s->System.out.println(s));
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
