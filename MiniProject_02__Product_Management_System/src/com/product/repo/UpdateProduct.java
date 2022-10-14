package com.product.repo;
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
public class UpdateProduct {
	
	public void updateProductPrice(int productId, double price) {
		try {
			// Object Creation 
			Class.forName("com.mysql.jdbc.Driver"); // Inherited from the driver Interface
			String url = "jdbc:mysql://localhost:3306/mini_project?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Welcome123mod");
			PreparedStatement pst = con.prepareStatement("update products set price = ? where productId = ?");
			
			pst.setDouble(1, price);
			pst.setInt(2, productId);
			
//			pst.executeQuery();
			int i = pst.executeUpdate();
			System.out.println("\n**********************");
			System.out.println(i + " - Record is Updated");
			System.out.println("**********************");
			pst.close(); con.close();	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e2) {
			e2.printStackTrace();
		}

	}
}
