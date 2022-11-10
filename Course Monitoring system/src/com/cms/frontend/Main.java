package com.cms.frontend;

import java.sql.Connection;
import java.util.Scanner;

import com.cms.DAO.ProvideConnection;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
	
		System.out.println("              Welcome to Course Monitoring System.             ");
		System.out.println("              ***********************************              ");
		System.out.println("");
		System.out.println("Enter your options 1, 2 or 3.");
		System.out.println("*****************************");
		System.out.println("");
		System.out.println("1 : Administrator");
		System.out.println("2 : Faculty");
		System.out.println("3 : Exit");
		
		
		int option = sc.nextInt();
		System.out.println(option);
		
		switch (option) {
		case 1: {
			
			System.out.println("Welcome Admin");
			
			 Connection conn= ProvideConnection.getConnection();
			 System.out.println(conn);
			break;
		}
		case 2:{
			System.out.println("Welcome Faculty");
			break;
		}
		case 3:{
			System.out.println("Thank you for visiting the portal. ");
			break;
		}
		default:
			System.out.println("You've made an invalid selection");
		}
		
		

	}

}
