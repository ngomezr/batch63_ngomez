/**
 * 
 */
package com.cogent.bean;

import java.io.Serializable;

/**
 * @author Norberto Gomez
 * @date: Sep 30, 2022
 *	
 * 
 */
// for IO its mandatory to implement to Serializable
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empNo;
	private String empName;
	private double sal;
	transient private double ysal; // dont want to store variable date in the FILE
	
	public Employee(int empNo, String empName, double sal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.sal = sal;
		this.ysal = sal*12;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", sal=" + sal + ", ysal=" + ysal + "]";
	}


}
