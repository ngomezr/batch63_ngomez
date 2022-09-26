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
public class Customer {
	private int custID;
	private String custName;
	private String custLoc;
	private String custPhno;

	public Customer(int custID, String custName, String custLoc, String custPhno) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.custLoc = custLoc;
		this.custPhno = custPhno;
	}

	
	public int getCustID() {
		return custID;
	}

	
	public void setCustID(int custID) {
		this.custID = custID;
	}

	
	public String getCustName() {
		return custName;
	}

	
	public void setCustName(String custName) {
		this.custName = custName;
	}

	
	public String getCustLoc() {
		return custLoc;
	}

	
	public void setCustLoc(String custLoc) {
		this.custLoc = custLoc;
	}

	
	public String getCustPhno() {
		return custPhno;
	}

	public void setCustPhno(String custPhno) {
		this.custPhno = custPhno;
	}
	
	public String display() {
		return ("CustomerID: " + this.custID 
				+ " | Customer: " + this.custName
				+ " | CustomerLoc: " + this.custLoc
				+ " | CustomerPhno: " + this.custPhno);
	}
	
}
