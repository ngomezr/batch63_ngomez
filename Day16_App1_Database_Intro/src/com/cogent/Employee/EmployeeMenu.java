/**
 * 
 */
package com.cogent.Employee;

import java.util.Scanner;

/**
 * @author Norberto Gomez
 * @date: Oct 11, 2022
 *	
 * 
 */
public class EmployeeMenu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("***************************");
		System.out.println("\t Menu");
		System.out.println("***************************");
		System.out.println("1. Add new Employee" 
		+ "\n" + "2. Update Employee First and Last Name" 
		+ "\n" + "3. Delete Employee by Id" 
		+ "\n" + "4. Find Employee by Id"
		+ "\n" + "5. Find Employee by First Name"
		+ "\n" + "6. Find Employee by Email"
		+ "\n" + "7. Exit Program");
		int choice = 0;
		System.out.print("Enter a choice from the menu: ");
		choice = scanner.nextInt();
		FindEmployee eF = new FindEmployee();
		while (choice < 7) {
			switch(choice) {
			case 1:
				InsertEmployee e = new InsertEmployee();
				int a = 0;
				String firstN = "";
				String lastN = "";
				String email = "";
				System.out.print("Enter Employee Number: ");
				a = scanner.nextInt();
				System.out.print("Enter Employee FirstName: ");
				firstN = scanner.next();
				System.out.print("Enter Employee LastName: ");
				lastN = scanner.next();
				System.out.print("Enter Employee Email: ");
				email = scanner.next();
				e.insertEmployee(a, firstN, lastN, email);
				break;
			case 2:
				UpdateEmployee uE = new UpdateEmployee();
				int b = 0;
				String firstN2 = "";
				String lastN2 = "";
				System.out.print("Enter Employee Number to identify: ");
				a = scanner.nextInt();
				System.out.print("Enter a new Employee FirstName: ");
				firstN = scanner.next();
				System.out.print("Enter a new Employee LastName: ");
				lastN = scanner.next();
				
				uE.updateEmployee(b, firstN2, lastN2);
				break;
			case 3:
				DeleteEmployee dE = new DeleteEmployee();
				int c = 0;
				System.out.print("Enter Employee Number to identify: ");
				c = scanner.nextInt();
				
				dE.deleteEmployee(c);
				break;
			case 4:
				int d = 0;
				System.out.print("Enter Employee Number to identify: ");
				d = scanner.nextInt();
				eF.findEmployeeById(d);
				break;
			case 5:
				String firstN3 = "";
				System.out.print("Enter Employee FirstName to identify: ");
				firstN3 = scanner.next();
				eF.findEmployeeByName(firstN3);
				break;
			case 6:
				String email2 ="";
				System.out.print("Enter Employee Email to identify: ");
				email2 = scanner.next();
				eF.findEmployeeByEmail(email2);
				break;
				
			}
			System.out.println("***************************");
			System.out.println("\t Menu");
			System.out.println("***************************");
			System.out.println("1. Add new Employee" 
			+ "\n" + "2. Update Employee First and Last Name" 
			+ "\n" + "3. Delete Employee by Id" 
			+ "\n" + "4. Find Employee by Id"
			+ "\n" + "5. Find Employee by First Name"
			+ "\n" + "6. Find Employee by Email"
			+ "\n" + "7. Exit Program");
			System.out.print("Enter a choice from the menu: ");
			choice = scanner.nextInt();
		}
		System.out.println("\nGoodBye!");
	}
}
