/**
 * 
 */
package com.cogent.controller;

import java.util.Iterator;
import java.util.Scanner;

import com.cogent.bean.CustomerBean;
import com.cogent.repo.CustomerRepo;

/**
 * @author Norberto Gomez
 * @date: Sep 26, 2022
 * 
 * 
 */
public class CustomerManager {
	public static void main(String[] args) {
		CustomerRepo cr = new CustomerRepo();
//		CustomerBean[] cb = {};
	
		Scanner sc = new Scanner(System.in);
		System.out.println("*****************************");
		System.out.println("CUSTOMER MANAGEMENT SYSTEM");
		System.out.println("*****************************");
		System.out.println("1. Add Customer " + "\n" 
		+ "2. View All Customers" + "\n" 
		+ "3. Search Customer by Id" + "\n"
		+ "4. Exit");
		int choice = sc.nextInt();
		String option = "";
		
		while (choice < 4) {
			switch(choice) {
			case(1):
				// Add Customer to collection.
				System.out.print("Please enter customer Id: ");
				long customerId = sc.nextLong();
				System.out.print("Please enter customer name: ");
				String customerName = sc.next();
				
				// Creating the object
				CustomerBean cb = new CustomerBean(customerId, customerName);
				
				// Add customer to the collection.
				cr.addCustomer(cb);
				
				System.out.print("Do you want to add more Customer? Press Y or N :");
				option = sc.next();
				
				break;
			case(2):
				// View All Customers
				for (int i = 0; i < cr.viewAllCustomers().length; i++) {
					System.out.println(cr.viewAllCustomers()[i].toString());
				}
				System.out.print("Press N to exit: ");
				option = sc.next();
				break;
			case(3):
				// Search Customer by Id
				System.out.println("User selected: " + choice);
			
				//Enter Customer Id
				System.out.print("Enter the Customer Id: ");
				long cusId = sc.nextLong();
				
				// Prints out the customer chosen 
				System.out.print(cr.searchCustomerById(cusId).toString());
				
				System.out.println();
				System.out.print("Press Y to Search More and Press N to go to Main Menu: ");
				option = sc.next();
				break;
			}
			System.out.println(option);
			if(option.equals("Y")) {
				// Continues to hit the case without switching.
				// If hit Yes
				continue;
			} else {
				System.out.println("*****************************");
				System.out.println("CUSTOMER MANAGEMENT SYSTEM");
				System.out.println("*****************************");
				System.out.println("1. Add Customer " + "\n" 
				+ "2. View All Customers" + "\n" 
				+ "3. Search Customer by Id" + "\n"
				+ "4. Exit");
				choice = sc.nextInt();
			}
		}
		System.out.println("GoodBye!");
	}
}
