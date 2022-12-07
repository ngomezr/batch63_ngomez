/**
 * 
 */
package com.cogent.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Norberto Gomez
 * @date: Nov 21, 2022
 *	
 * 
 */

class Employee {
	int employeeId;
	String employeeName;
	
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName);
		// return 1;
		// returns in insertion order
	}	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	
}

public class Test_1 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(11, "Norberto");
		Employee emp2 = new Employee(10, "Vadim");
		Employee emp3 = new Employee(9, "Rijo");
		
		Map<Employee, Integer> map1 = new HashMap(); 
		map1.put(emp1, 11);
		map1.put(emp2, 10);
		map1.put(emp3, 9);
			
		System.out.println(map1);
		
	}

}
