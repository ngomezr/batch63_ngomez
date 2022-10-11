package com.cogent.Employee;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 
 */

/**
 * @author Norberto Gomez
 * @date: Oct 10, 2022
 *	
 * 
 */
public class UpdateEmployee {
	
	public void updateEmployee(int empNo, String empFName, String empLName) {
		try {
			// Object Creation 
			Class.forName("com.mysql.jdbc.Driver"); // Inherited from the driver Interface
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Welcome123mod");
			PreparedStatement pst = con.prepareStatement("update employee set empFirstName = ?, empLastName = ? where empNo = ?");
			
			pst.setString(1, empFName);
			pst.setString(2, empLName);
			pst.setInt(3, empNo);
//			pst.executeQuery();
			int i = pst.executeUpdate();
			System.out.println("\n**********************");
			System.out.println(i + " - Record is Updated");
			System.out.println("**********************\n");
			pst.close(); con.close();	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e2) {
			e2.printStackTrace();
		}

	}
}
