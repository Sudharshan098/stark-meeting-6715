package com.cms.batch;

import java.util.List;
import java.util.Scanner;

import com.cms.Exception.BatchException;
import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;
import com.cms.adminfunctions.AdminOptions;
import com.cms.frontend.Main;
import com.cms.models.Batch;
import com.cms.models.Course;

public class ViewBatch {
	
	public static void getBatchList() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Batch List");
		System.out.println("==========");
		AdminUtil adUtil = new AdminUtilImpl();
		List<Batch> list;
		try {
			list = adUtil.viewBatchList();
			list.forEach(s->System.out.println(s));
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
