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
public class DeleteProduct {
	public void deleteProductById(int productId) {
		try {
			// Object Creation 
			Class.forName("com.mysql.jdbc.Driver"); // Inherited from the driver Interface
			String url = "jdbc:mysql://localhost:3306/mini_project?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Welcome123mod");
			PreparedStatement pst = con.prepareStatement("delete from products where productId = ?");
			
			pst.setInt(1, productId);
			int i = pst.executeUpdate();
			System.out.println("\n**********************");
			System.out.println(i + " - Record is deleted");
			System.out.println("**********************\n");
			pst.close(); con.close();	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e2) {
			e2.printStackTrace();
		}
	}
	
	public void deleteProductByCat(String category) {
		try {
			// Object Creation 
			Class.forName("com.mysql.jdbc.Driver"); // Inherited from the driver Interface
			String url = "jdbc:mysql://localhost:3306/mini_project?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Welcome123mod");
			PreparedStatement pst = con.prepareStatement("delete from products where pcat = ?");
			
			pst.setString(1, category);
			int i = pst.executeUpdate();
			System.out.println("\n**********************");
			System.out.println(i + " - Record is deleted");
			System.out.println("**********************\n");
			pst.close(); con.close();	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e2) {
			e2.printStackTrace();
		}
	}
}
