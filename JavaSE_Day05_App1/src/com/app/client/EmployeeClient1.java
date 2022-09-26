/**
 * 
 */
package com.app.client;

import com.bean.Employee;

/**
 * @author Norberto Gomez
 * @date: Sep 23, 2022
 *	
 * 
 */
public class EmployeeClient1 {
	public static void main(String[] args) {
		// Ctrl + Space --> give u options to import
		Employee e1 = new Employee();
		e1.setEmpNO(100);
		e1.setEmpName("Dan");
		e1.setSalary(1000);
		e1.setEmail("dan@gmail.com");
		
		System.out.println(e1.getEmpNO() 
				+ " | " + e1.getEmpName()
				+ " | " + e1.getSalary()
				+ " | " + e1.getEmail());
		
		Employee e2 = new Employee();
		e2.setEmpNO(200);
		e2.setEmpName("Mark");
		e2.setSalary(1100);
		e2.setEmail("mark@gmail.com");
		
		System.out.println(e2.getEmpNO() 
				+ " | " + e2.getEmpName()
				+ " | " + e2.getSalary()
				+ " | " + e2.getEmail());
		
	}
}
