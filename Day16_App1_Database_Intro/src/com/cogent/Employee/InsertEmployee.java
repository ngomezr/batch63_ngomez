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
public class InsertEmployee {
	
	public void insertEmployee(int empNo, String empFirstN, String empLastN, String empE) {
		try {
			// Object Creation 
			Class.forName("com.mysql.jdbc.Driver"); // Inherited from the driver Interface
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Welcome123mod");
			PreparedStatement pst = con.prepareStatement("insert into employee values(?,?,?,?)");
			
			pst.setInt(1, empNo);
			pst.setString(2, empFirstN);
			pst.setString(3, empLastN);
			pst.setString(4, empE);
//			pst.executeQuery();
			int i = pst.executeUpdate();
			System.out.println("\n**********************");
			System.out.println(i + " - Record are inserted");
			System.out.println("**********************\n");
			
			pst.close(); con.close();	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e2) {
			e2.printStackTrace();
		}

	}
}
