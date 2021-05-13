package com.bz.eh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionHandlingDemo {

	public static void main(String args[]) {
		
		String str = null;
		int x[] = {1,2,3,4,5};
		try {
			System.out.println(" Start from here");
//			for(int i=0;i<6;i++) {
//				System.out.println(x[i]);
//			}
			str.length();
			System.out.println("end here");
			//Connection connection = DriverManager.getConnection("");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException handled");
		}
//		catch (SQLException e) {
//			System.out.println("SQLException handled");
//		}
		finally {
			System.out.println("finally");
		}
		
		System.out.println("My string");
	}
}
