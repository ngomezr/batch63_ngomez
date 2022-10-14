/**
 * 
 */
package com.product.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

/**
 * @author Norberto Gomez
 * @date: Oct 14, 2022
 *	
 * 
 */
public class InsertProduct {
	public void insertProduct(int pid, String pname, String pcat, Date manufacture_date, double price, Date expiry_date) {
		try {
			// Object Creation 
			Class.forName("com.mysql.jdbc.Driver"); // Inherited from the driver Interface
			String url = "jdbc:mysql://localhost:3306/mini_project?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Welcome123mod");
			PreparedStatement pst = con.prepareStatement("insert into products values(?,?,?,?,?,?)");
			
			pst.setInt(1, pid);
			pst.setString(2, pname);
			pst.setString(3, pcat);
			pst.setDate(4, new java.sql.Date(manufacture_date.getTime()));
			pst.setDouble(5, price);
			pst.setDate(6, new java.sql.Date(expiry_date.getTime()));
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
