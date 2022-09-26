/**
 * 
 */
package com.cogent.bean;

/**
 * @author Norberto Gomez
 * @date: Sep 26, 2022
 *	
 * 
 */
public class CustomerBean {
	private long customerId;
	private String customerName;
	
	public CustomerBean() {} // default constructor
	
	public CustomerBean(long customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	@Override
	public String toString() {
		return "Customer ID: " + this.customerId 
			 + "\n" + "Customer Name: " + this.customerName 
			 + "\n";
	}
}
