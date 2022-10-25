/**
 * 
 */
package com.cogent.service;

import java.util.List;

import com.cogent.bean.EmployeeBean;
import com.cogent.repo.EmployeeRepo;
import com.cogent.repo.EmployeeRepoImpl;

/**
 * @author Norberto Gomez
 * @date: Sep 28, 2022
 *	
 * 
 */

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepo employeeRepo = new EmployeeRepoImpl();
	
	@Override
	public void addNewEmployee(EmployeeBean employee) {
		employeeRepo.addNewEmployee(employee);
	}

	@Override
	public void deleteEmployeeById(long employeeId) {
		employeeRepo.deleteEmployeeById(employeeId);
	}

	@Override
	public EmployeeBean findEmployeeById(long employeeId) {
		return employeeRepo.findEmployeeById(employeeId);
	}

	@Override
	public EmployeeBean findYoungestEmployee() {
		return employeeRepo.findYoungestEmployee();
	}

	@Override
	public void viewEmployee() {
		employeeRepo.viewEmployee();
	}

	@Override
	public List<EmployeeBean> findByCountry(String employeeCountry) {
		return employeeRepo.findByCountry(employeeCountry);
	}

	@Override
	public List<EmployeeBean> findByCountryCity(String employeeCounty, String employeeCity) {
		return employeeRepo.findByCountryCity(employeeCounty, employeeCity);
	}
}
