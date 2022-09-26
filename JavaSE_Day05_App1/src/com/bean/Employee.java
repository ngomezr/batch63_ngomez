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
public class Employee {
	private int empNO;
	private String empName;
	private double salary;
	private String email;
	
	public int getEmpNO() {
		return empNO;
	}

	
	public void setEmpNO(int empNO) {
		this.empNO = empNO;
	}

	
	public String getEmpName() {
		return empName;
	}

	
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public String getEmail() {
		return email;
	}

	
	public void setEmail(String email) {
		this.email = email;
	}

	public Employee() {
		
	}
	
}
