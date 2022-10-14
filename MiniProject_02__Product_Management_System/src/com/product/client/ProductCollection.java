/**
 * 
 */
package com.product.client;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.product.bean.Product;
import com.product.exception.ProductException;
import com.product.service.ProductService;
import com.product.service.ProductServiceImpl;

/**
 * @author Norberto Gomez
 * @date: Oct 14, 2022
 * 
 * 
 */
public class ProductCollection {
	public static void main(String[] args) {
		ProductService ps = new ProductServiceImpl();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("+*************************************+");
		System.out.println("|\t\tMenu" + "\t\t      |");
		System.out.println("+*************************************+");
		System.out.println("| 1. Add new Product                  |"  
		+ "\n" + "| 2. Delete Product by Id             |" 
		+ "\n" + "| 3. Delete Product by Category       | " 
		+ "\n" + "| 4. Find Product by Id               |"
		+ "\n" + "| 5. Find Product by Category         |"
		+ "\n" + "| 6. Find Cheapest Product by Category|" 
		+ "\n" + "| 7. Find Expired Products            |"
		+ "\n" + "| 8. Update Products                  |"
		+ "\n" + "| 9. Exit Program                     |");
		System.out.println("+*************************************+");
		int choice = 0;
		System.out.print("Enter a choice from the menu: ");
		choice = scanner.nextInt();
		Product product = null;
		while(choice < 9) {
			switch(choice) {
			case 1:
				// ADD A NEW PRODUCT 
				product = new Product();
				System.out.print("Enter Product Id: ");
				product.setPid(Integer.parseInt(scanner.next()));
				scanner.nextLine();// Consuming the leftover new line
		        // using the nextLine() method
				System.out.print("Enter Product Name: ");
				product.setPname(scanner.nextLine());
				System.out.print("Enter Product Category: ");
				product.setPcat(scanner.nextLine());
				System.out.print("Enter Product Manufacture Date(YYYY-MM-DD): ");
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				Date manuDate = null;
				try {
					manuDate = dateFormat.parse(scanner.next());
				} catch (ParseException e) {
					e.printStackTrace();
				} 
				product.setManufacture_date(manuDate);
				System.out.print("Enter Product Price: ");
				product.setPrice(scanner.nextDouble());
				System.out.print("Enter Product Expiration Date(YYYY-MM-DD): ");
				Date expDate = null;
				try {
					expDate = dateFormat.parse(scanner.next());
				}  catch (ParseException e) {
					e.printStackTrace();
				} 
				product.setExpiry_date(expDate);
				
				ps.addNewProduct(product);
				// Testing purpose
//				System.out.println(product.toString()); 
				break;
			case 2:
				// DELETE PRODUCT BY ID
				System.out.print("Enter Product Id: ");
				ps.deleteProductById(scanner.nextInt());
				break;
			case 3:
				// DELETE PRODUCT BY CATEGORY
				System.out.print("Enter a Product Category: ");
				scanner.nextLine();
				ps.deleteProductByCat(scanner.nextLine());
				break;
			case 4:
				// FIND PRODUCT BY ID
				System.out.print("Enter Product Id: ");
				int pid = scanner.nextInt();
				Product p = null;
				try {
					if(ps.findProductById(pid) != null) {
						p = ps.findProductById(pid);
					} else {
						ProductException pe = new ProductException(
								"Product doesn't exisit");
						throw pe;
					}
				} catch (ProductException e) {
					e.printStackTrace();
				}
				System.out.println(p.toString() + "\n");
				break;
			case 5:
				// FIND PRODUCT BY CATEGORY
				System.out.print("Enter a Product Category: ");
				scanner.nextLine();
				List<Product> products = ps.findProductByCat(scanner.nextLine());
				for (Product prod : products) {
					System.out.println(prod.toString());
				}
				System.out.println();
				break;
			case 6:
				// FIND Cheapest by Category
				System.out.print("Enter a Product Category: ");
				scanner.nextLine();
				Product chp = ps.findCheapestProductInCat(scanner.nextLine());
				System.out.println(chp.toString());
				break;
			case 7:
				// FIND EXPIRED PRODUCTS
				List<Product> products2 = ps.findExpiredProducts();
				for (Product prod2 : products2) {
					System.out.println(prod2.toString());
				}
				System.out.println();
				break;
			case 8:
				// Update Products Prices
				System.out.print("Enter Product Id: ");
				int id = scanner.nextInt();
				Product p2 = ps.findProductById(id);
				System.out.println(p2.toString() + "\n");
//				---------------------------------------------------
				System.out.print("Enter a new Price for the Product Above: ");
				ps.updateProduct(id, scanner.nextDouble());
				Product newProd = ps.findProductById(id);
				System.out.println("Update Product: ");
				System.out.println(newProd.toString() + "\n");
				break;
			}
			System.out.println("+*************************************+");
			System.out.println("|\t\tMenu" + "\t\t      |");
			System.out.println("+*************************************+");
			System.out.println("| 1. Add new Product                  |"  
			+ "\n" + "| 2. Delete Product by Id             |" 
			+ "\n" + "| 3. Delete Product by Category       | " 
			+ "\n" + "| 4. Find Product by Id               |"
			+ "\n" + "| 5. Find Product by Category         |"
			+ "\n" + "| 6. Find Cheapest Product by Category|" 
			+ "\n" + "| 7. Find Expired Products            |"
			+ "\n" + "| 8. Update Products                  |"
			+ "\n" + "| 9. Exit Program                     |");
			System.out.println("+*************************************+");
			System.out.print("Enter a choice from the menu: ");
			choice = scanner.nextInt();
		}
		System.out.println("\nGoodBye!");
	}
}