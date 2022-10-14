package com.cogent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

import java.util.Scanner;
/**
 * 
 */

/**
 * @author Norberto Gomez
 * @date: Oct 10, 2022
 *	
 * 
 */
public class InsertDemo {
	
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			// Object Creation 
			Class.forName("com.mysql.jdbc.Driver"); // Inherited from the driver Interface
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Welcome123mod");
			PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?)");
			int a = 0;
			String stname = "";
			String email = "";
			
			System.out.print("Enter a student number: ");
			a = scanner.nextInt();
			System.out.print("Enter the student name: ");
			stname = scanner.next();
			System.out.print("Enter the student email: ");
			email = scanner.next();
			
			pst.setInt(1, a);
			pst.setString(2, stname);
			pst.setString(3, email);
//			pst.executeQuery();
			int i = pst.executeUpdate();
			
			System.out.println("Records are inserted -- " + i);
			
			pst.close(); con.close();	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e2) {
			e2.printStackTrace();
		}

	}
}
