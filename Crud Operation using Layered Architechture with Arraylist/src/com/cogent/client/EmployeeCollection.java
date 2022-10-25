/**
 * 
 */
package com.cogent.client;

import java.util.List;
import java.util.Scanner;

import com.cogent.bean.EmployeeBean;
import com.cogent.service.EmployeeService;
import com.cogent.service.EmployeeServiceImpl;

/**
 * @author Norberto Gomez
 * @date: Sep 28, 2022
 *	
 * 
 */
public class EmployeeCollection {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		EmployeeService es = new EmployeeServiceImpl();
		
		System.out.println("***************************");
		System.out.println("\t Menu");
		System.out.println("***************************");
		System.out.println("1. Add new Employee" 
		+ "\n" + "2. View All Employee" 
		+ "\n" + "3. Find Employee by Id" 
		+ "\n" + "4. Delete Employee by Id" 
		+ "\n" + "5. Find the youngest Employee"
		+ "\n" + "6. Display All Employees by a certain Country"
		+ "\n" + "7. Display All Employees by a certain Country and City"
		+ "\n" + "8. Exit Program");
		int choice = 0;
		System.out.print("Enter a choice from the menu: ");
		choice = scanner.nextInt();
		// Declaring a book but set to Null
		EmployeeBean employee = null;
		while(choice < 8) {
			switch(choice) {
			case 1:
				// Adding of new Employee
				employee = new EmployeeBean();
				System.out.println("Enter Employee Id: ");
				employee.setEmployeeId(scanner.nextLong());
				System.out.println("Enter Employee First Name: ");
				employee.setEmployeeFName(scanner.next());
				System.out.println("Enter Employee Last Name: ");
				employee.setEmployeeLName(scanner.next());
				System.out.println("Enter Employee Email: ");
				employee.setEmployeeEmail(scanner.next());
				System.out.println("Enter Employee Age: ");
				employee.setEmployeeAge(scanner.nextInt());
				System.out.println("Is the Employee Married? (True or False): ");
				employee.setEmployeeIsMarried(scanner.nextBoolean());
				// If I used nextLine() with current scanner then it will skip the last option and give me an error
				// Adding another scanner here seem to work for current fix.
				Scanner scanner2 = new Scanner(System.in)
;				System.out.println("Enter Employee City: ");
				employee.setEmployeeCity(scanner2.nextLine());
				System.out.println("Enter Employee County: ");
				employee.setEmployeeCountry(scanner.next());
				es.addNewEmployee(employee);
				break;
			case 2:
				// Viewing of all Employee's
				System.out.println("\nList of All Employee's: ");
				es.viewEmployee();
				break;
			case 3:
				// Find Employee by Id
				System.out.print("\nEnter an Id to find: ");
				EmployeeBean tempE = es.findEmployeeById(scanner.nextLong());
				if(tempE != null) {
					System.out.println(tempE.toString());
				} else {
					System.out.println("\nEmployee doesn't exisit! ");
				}
				break;
			case 4:
				// Delete Employee by Id
				System.out.print("\nEnter an Id of an Employee to Delete: ");
				es.deleteEmployeeById(scanner.nextLong());
				break;
			case 5:
				// Find Youngest Employee
				EmployeeBean tempY = es.findYoungestEmployee();
				System.out.println("\nCurrent Youngest Employee in the Repository: ");
				System.out.println(tempY.toString());				
				break;
			case 6:
				// Find Employee's based off their City 
				System.out.print("Enter name of a Country: ");
				List<EmployeeBean> tempCountry = es.findByCountry(scanner.next());
				
				System.out.println("\nList of Employee's: ");
				for (int i = 0; i < tempCountry.size(); i++) {
					System.out.println(tempCountry.get(i).toString() + "\n");
				}
				break;
			case 7:
				// Find Employee's based off their City and Country 
				//-------------------------------------------------
				// Had to create a new Scanner for this purpose because the "nextLine()" 
				// was giving me an issue while try to keep using the "scanner"
				// because it checks the nextLine of the input.
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter name of a City: ");
				String city = sc.nextLine();
				System.out.print("Enter name of a Country: ");
				String country = scanner.next();
				
				List<EmployeeBean> tempCC = es.findByCountryCity(country, city);
				// Testing purpose
//				System.out.println(country + " " + city + " " + tempCC.size());
				System.out.println("\nList of Employee's: ");
				for (int i = 0; i < tempCC.size(); i++) {
					System.out.println(tempCC.get(i).toString());
				}
				break;
			}
			System.out.println("\n");
			System.out.println("***************************");
			System.out.println("\t Menu");
			System.out.println("***************************");
			System.out.println("1. Add new Employee" 
			+ "\n" + "2. View All Employee" 
			+ "\n" + "3. Find Employee by Id" 
			+ "\n" + "4. Delete Employee by Id" 
			+ "\n" + "5. Find the youngest Employee"
			+ "\n" + "6. Display All Employees by a certain Country"
			+ "\n" + "7. Display All Employees by a certain Country and City"
			+ "\n" + "8. Exit Program");
			
			System.out.print("Enter a choice from the menu: ");
			choice = scanner.nextInt();
		}
		System.out.println("\nGoodBye!");
	}
}
