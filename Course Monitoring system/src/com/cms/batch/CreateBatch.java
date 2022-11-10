package com.cms.batch;

import java.util.Scanner;

import com.cms.admin.AdminUtil;
import com.cms.admin.AdminUtilImpl;
import com.cms.models.Batch;
import com.cms.models.Faculty;

public class CreateBatch {
	
	
	
	public static void addBatch() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Batch Id");
		int batchid = sc.nextInt();
		
		
		System.out.println("Enter Course Id");
		int courseid = sc.nextInt();
		
		System.out.println("Enter Faculty Id");
		int facultyid = sc.nextInt();
		
		System.out.println("Enter Number of students");
		int num = sc.nextInt();
		
		System.out.println("Enter Batch start date");
		String date=sc.next();

		System.out.println("Enter Duration");
		String duration=sc.next();

		
		Batch batch=new Batch(batchid, courseid, facultyid, num, date, duration);				
		
		AdminUtil adu=new AdminUtilImpl();
		
		String result= adu.addBatch(batch);
		
		System.out.println(result);
	}
	
	

}
