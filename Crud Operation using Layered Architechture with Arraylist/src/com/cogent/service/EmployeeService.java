/**
 * 
 */
package com.cogent.service;

import java.util.List;

import com.cogent.bean.EmployeeBean;

/**
 * @author Norberto Gomez
 * @date: Sep 28, 2022
 *	
 * 
 */
public interface EmployeeService {
	public void addNewEmployee(EmployeeBean employee);
	public void deleteEmployeeById(long employeeId);
	public EmployeeBean findEmployeeById(long employeeId);
	public EmployeeBean findYoungestEmployee();
	public void viewEmployee(); 
	public List<EmployeeBean> findByCountry(String employeeCountry);
	public List<EmployeeBean> findByCountryCity(String employeeCounty, String employeeCity);
}
