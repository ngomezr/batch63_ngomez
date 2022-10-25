/**
 * 
 */
package com.cogent.repo;

import java.util.ArrayList;
import java.util.List;

import com.cogent.bean.EmployeeBean;

/**
 * @author Norberto Gomez
 * @date: Sep 28, 2022
 * 
 * 
 */
public class EmployeeRepoImpl implements EmployeeRepo {
	// Repository
	List<EmployeeBean> emps = new ArrayList<>();

	// IIB - Instance Initialization Block
	{
		// Pre-populating Data for Repository.
		emps.add(new EmployeeBean(1, "Example1", "LastName1", "ex1last@gmail.com", 22, false, "Los Angeles", "USA"));
		emps.add(new EmployeeBean(2, "Example2", "LastName2", "ex2last@gmail.com", 32, true, "Austin", "USA"));
		emps.add(new EmployeeBean(3, "Example3", "LastName3", "ex3last@gmail.com", 21, false, "Mumbai", "India"));
		emps.add(new EmployeeBean(4, "Example4", "LastName4", "ex4last@gmail.com", 18, false, "Mumi", "India"));

	}

	@Override
	public void addNewEmployee(EmployeeBean employee) {
		emps.add(employee);
	}

	@Override
	public void deleteEmployeeById(long employeeId) {
		for (int i = 0; i < emps.size(); i++) {
			if (emps.get(i).getEmployeeId() == employeeId) {
				System.out.println("Employee Found and will be Deleted from Repository!");
				emps.remove(i);
			}
		}
		// Rechecks the last value that the for-Loop iterated and have it return that
		// the Employee really doesn't exist
		if (emps.get(emps.size() - 1).getEmployeeId() != employeeId) {
			System.out.println("Employee you tried to delete doesn't exisit!");
		}
	}

	@Override
	public EmployeeBean findEmployeeById(long employeeId) {
		for (int i = 0; i < emps.size(); i++) {
			if (emps.get(i).getEmployeeId() == employeeId) {
				System.out.println("\nEmployee Found: ");
				return emps.get(i);
			}
		}
		return null;
	}

	@Override
	public EmployeeBean findYoungestEmployee() {
		EmployeeBean currentYoungest = null;
		for (int i = 1; i < emps.size(); i++) {
			currentYoungest = emps.get(0);
			if (currentYoungest.getEmployeeAge() > emps.get(i).getEmployeeAge()) {
				currentYoungest = emps.get(i);
			}
		}
		return currentYoungest;
	}

	@Override
	public void viewEmployee() {
		for (int i = 0; i < emps.size(); i++) {
			System.out.println(emps.get(i).toString() + "\n");
		}
	}

	@Override
	public List<EmployeeBean> findByCountry(String employeeCountry) {
		List<EmployeeBean> tempCountry = new ArrayList<>();
		for (int i = 0; i < emps.size(); i++) {
			if(emps.get(i).getEmployeeCountry().equals(employeeCountry)) {
				tempCountry.add(emps.get(i));
			}
		}
		return tempCountry;
	}

	@Override
	public List<EmployeeBean> findByCountryCity(String employeeCountry, String employeeCity) {
		List<EmployeeBean> tempCountryCity = new ArrayList<>();
		for (int i = 0; i < emps.size(); i++) {
			if(emps.get(i).getEmployeeCountry().equals(employeeCountry) 
					&& emps.get(i).getEmployeeCity().equals(employeeCity)) {
				tempCountryCity.add(emps.get(i));
			}
		}
		return tempCountryCity;
	}

}
