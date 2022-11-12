package com.cms.adminfunctions;

import java.util.List;
import java.util.Scanner;

import com.cms.Exception.BatchException;
import com.cms.Exception.CourseException;
import com.cms.Exception.FacultyException;
import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;
import com.cms.frontend.Main;
import com.cms.models.Report;

public class GenerateReport {
	
	public static void getReport() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Report Generation");
		System.out.println("=================");
		System.out.println();
		System.out.println("Enter batch ID to generate the report");
		int id=sc.nextInt();
		
		AdminUtil adu = new AdminUtilImpl();
		try {
			List<Report> list= adu.generateReport(id);
			list.forEach(s->System.out.println(s));
			 System.out.println();

		} catch (BatchException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (CourseException e) {
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
