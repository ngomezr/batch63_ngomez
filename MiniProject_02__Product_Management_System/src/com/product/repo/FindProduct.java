/**
 * 
 */
package com.product.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.product.bean.Product;

/**
 * @author Norberto Gomez
 * @date: Oct 11, 2022
 *	
 * 
 */
public class FindProduct {
	public Product findProductById(int productId) {
		Product product = null;
		try {
			// Object Creation 
			Class.forName("com.mysql.jdbc.Driver"); // Inherited from the driver Interface
			String url = "jdbc:mysql://localhost:3306/mini_project?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Welcome123mod");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from products where productId =" + productId);
			while(rs.next()) {
				product = new Product(
						rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getDate(4),
						rs.getDouble(5), rs.getDate(6)); 
			}
			rs.close(); st.close(); con.close();
						
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e2) {
			e2.printStackTrace();
		}
		return product;
	}
	
	public List<Product> findProductByCategory(String category) {
		List<Product> products = new ArrayList<>();
		try {
			// Object Creation 
			Class.forName("com.mysql.jdbc.Driver"); // Inherited from the driver Interface
			String url = "jdbc:mysql://localhost:3306/mini_project?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Welcome123mod");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from products where pcat='" + category +"'");
			System.out.println();
			while(rs.next()) {
				Product prod = new Product();
				prod.setPid(rs.getInt(1));
				prod.setPname(rs.getString(2));
				prod.setPcat(rs.getString(3));
				prod.setManufacture_date(rs.getDate(4));
				prod.setPrice(rs.getDouble(5));
				prod.setExpiry_date(rs.getDate(6));
				products.add(prod);
			}
			rs.close(); st.close(); con.close();
						
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e2) {
			e2.printStackTrace();
		}
		return products;
	}
	
	public Product findCheapestProductByCat(String category) {
		Product product = null;
		try {
			// Object Creation 
			Class.forName("com.mysql.jdbc.Driver"); // Inherited from the driver Interface
			String url = "jdbc:mysql://localhost:3306/mini_project?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Welcome123mod");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from products where pcat='"+ category + "' group by price order by price limit 1");
			System.out.println();
			while(rs.next()) {
				product = new Product(
						rs.getInt(1), rs.getString(2),
						rs.getString(3), rs.getDate(4),
						rs.getDouble(5), rs.getDate(6)); 
			}
			rs.close(); st.close(); con.close();
						
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e2) {
			e2.printStackTrace();
		}
		return product;
	}
	
	public List<Product> findExpiredProducts() {
		List<Product> products = new ArrayList<>();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date pDate = new Date();
		String currDate = dateFormat.format(pDate);
		try {
			// Object Creation 
			Class.forName("com.mysql.jdbc.Driver"); // Inherited from the driver Interface
			String url = "jdbc:mysql://localhost:3306/mini_project?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root", "Welcome123mod");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from products where expiry_date < '" + currDate +"'");
			System.out.println();
			while(rs.next()) {
				Product prod = new Product();
				prod.setPid(rs.getInt(1));
				prod.setPname(rs.getString(2));
				prod.setPcat(rs.getString(3));
				prod.setManufacture_date(rs.getDate(4));
				prod.setPrice(rs.getDouble(5));
				prod.setExpiry_date(rs.getDate(6));
				products.add(prod);
			}
			rs.close(); st.close(); con.close();
						
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e2) {
			e2.printStackTrace();
		}	
		return products;
	}
}
