/**
 * 
 */
package com.bean;

/**
 * @author Norberto Gomez
 * @date: Sep 23, 2022
 *	
 * 
 */
public class Employee2 {
	private int empNO;
	private String empName;
	private double salary;
	private String email;
	
	public Employee2(int empNO, String empName, double salary, String email) {
		super();
		this.empNO = empNO;
		this.empName = empName;
		this.salary = salary;
		this.email = email;
	}
	
	public String display() {
		return (this.empNO 
				+ " | " + this.empName
				+ " | " + this.salary
				+ " | " + this.email);
	}

}
