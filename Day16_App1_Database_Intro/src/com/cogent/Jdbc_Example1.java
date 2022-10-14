package com.cogent;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
/**
 * 
 */

/**
 * @author Norberto Gomez
 * @date: Oct 10, 2022
 *	
 * 
 */
public class Jdbc_Example1 {
	
	public static void main(String[] args) {
		
		// try with resources (more than one can go inside)
		// try() { }
		try {
			// Object Creation 
			Class.forName("com.mysql.jdbc.Driver"); // Inherited from the driver Interface
			String url = "jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Welcome123mod");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from orders");
		
			ResultSetMetaData md =  rs.getMetaData();
			int x = md.getColumnCount();
			for (int i = 1; i <= x; i++) {
				System.out.print(md.getColumnName(i).toUpperCase() + " ");
			}
			System.out.println("");
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
			}
			System.out.println("Get Connected");
			rs.close(); st.close(); con.close();
						
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e2) {
			e2.printStackTrace();
		} finally {
			try {
//				rs.close(); st.close(); con.close();
			} catch (Exception e3) {
				e3.printStackTrace();
			}
		} 

	}
}
