/**
 * 
 */
package com.cogent.bean;

/**
 * @author Norberto Gomez
 * @date: Sep 28, 2022
 *	
 * 
 */
public class EmployeeBean {
	private long employeeId;
	private String employeeFName;
	private String employeeLName;
	private String employeeEmail;
	private int employeeAge;
	private boolean employeeIsMarried;
	private String employeeCity;
	private String employeeCountry;

	public EmployeeBean() {
		// Default constructor
	}
	
	public EmployeeBean(long employeeId, String employeeFName, String employeeLName, String employeeEmail,
			int employeeAge, boolean employeeIsMarried, String employeeCity, String employeeCountry) {
		super();
		this.employeeId = employeeId;
		this.employeeFName = employeeFName;
		this.employeeLName = employeeLName;
		this.employeeEmail = employeeEmail;
		this.employeeAge = employeeAge;
		this.employeeIsMarried = employeeIsMarried;
		this.employeeCity = employeeCity;
		this.employeeCountry = employeeCountry;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeFName() {
		return employeeFName;
	}

	public void setEmployeeFName(String employeeFName) {
		this.employeeFName = employeeFName;
	}

	public String getEmployeeLName() {
		return employeeLName;
	}

	public void setEmployeeLName(String employeeLName) {
		this.employeeLName = employeeLName;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public boolean isEmployeeIsMarried() {
		return employeeIsMarried;
	}

	public void setEmployeeIsMarried(boolean employeeIsMarried) {
		this.employeeIsMarried = employeeIsMarried;
	}

	public String getEmployeeCity() {
		return employeeCity;
	}

	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}

	public String getEmployeeCountry() {
		return employeeCountry;
	}

	public void setEmployeeCountry(String employeeCountry) {
		this.employeeCountry = employeeCountry;
	}
	
	@Override 
	public String toString() {
		return "Id: " + this.employeeId 
				+ "\n" + "First Name: " + this.employeeFName
				+ "\n" + "Last Name: " + this.employeeLName
				+ "\n" + "Email: " + this.employeeEmail
				+ "\n" + "Age: " + this.employeeAge
				+ "\n" + "IsMarried: " + this.employeeIsMarried 
				+ "\n" + "City: " + this.employeeCity
				+ "\n" + "County: " + this.employeeCountry;
	}
}
