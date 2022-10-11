/**
 * 
 */
package com.cogent.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Norberto Gomez
 * @date: Oct 11, 2022
 *	
 * 
 */
public class FindEmployee {
	public void findEmployeeById(int employeeId) {
		try {
			// Object Creation 
			Class.forName("com.mysql.jdbc.Driver"); // Inherited from the driver Interface
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Welcome123mod");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from employee where empNo =" + employeeId);
			System.out.println("\nEmployee: ");
			while(rs.next()) {
				System.out.println("Id: "+ rs.getInt(1) + " FirstName: " + rs.getString(2) + " LastName: " + rs.getString(3) + " Email: " + rs.getString(4));
			}
			System.out.println("");
			rs.close(); st.close(); con.close();
						
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e2) {
			e2.printStackTrace();
		}
	}
	
	public void findEmployeeByName(String firstName) {
		try {
			// Object Creation 
			Class.forName("com.mysql.jdbc.Driver"); // Inherited from the driver Interface
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Welcome123mod");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from employee where empFirstName ='" + firstName+"'");
			System.out.println("\nEmployee: ");
			while(rs.next()) {
				System.out.println("Id: "+ rs.getInt(1) + " FirstName: " + rs.getString(2) + " LastName: " + rs.getString(3) + " Email: " + rs.getString(4));
			}
			System.out.println("");
			rs.close(); st.close(); con.close();
						
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e2) {
			e2.printStackTrace();
		}
	}
	
	public void findEmployeeByEmail(String email) {
		try {
			// Object Creation 
			Class.forName("com.mysql.jdbc.Driver"); // Inherited from the driver Interface
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Welcome123mod");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from employee where empEmail ='" + email + "'");
			System.out.println("\nEmployee: ");
			while(rs.next()) {
				System.out.println("Id: "+ rs.getInt(1) + " FirstName: " + rs.getString(2) + " LastName: " + rs.getString(3) + " Email: " + rs.getString(4));
			}
			System.out.println("");
			rs.close(); st.close(); con.close();
						
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e2) {
			e2.printStackTrace();
		}
	}
}
