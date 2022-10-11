package com.cogent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.sql.Statement;
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
public class DeleteDemo {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			// Object Creation 
			Class.forName("com.mysql.jdbc.Driver"); // Inherited from the driver Interface
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Welcome123mod");
			PreparedStatement pst = con.prepareStatement("delete from student where stno = ?");
			int a = 0;
			
			System.out.print("Enter a student number: ");
			a = scanner.nextInt();
			
			pst.setInt(1, a);
			int i = pst.executeUpdate();
			System.out.println(i + " -- Record is deleted");
			
			pst.close(); con.close();	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e2) {
			e2.printStackTrace();
		}

	}
}
