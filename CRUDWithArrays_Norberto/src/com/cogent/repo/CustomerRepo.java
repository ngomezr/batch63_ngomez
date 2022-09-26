/**
 * 
 */
package com.cogent.repo;

import com.cogent.bean.CustomerBean;

/**
 * @author Norberto Gomez
 * @date: Sep 26, 2022
 *	
 * 
 */
public class CustomerRepo {
	CustomerBean[] c = {};
	int counter = 0;
	
	public void addCustomer(CustomerBean customerBean) {
		counter = counter + 1;
//		System.out.println(counter);
		CustomerBean[] newArray;
		
		if(c.length == 0) {
			newArray = new CustomerBean[counter]; 
			
			newArray[counter - 1] = customerBean;
			
			c = newArray;
		} else {
			newArray = new CustomerBean[counter];
			
			for(int i = 0; i < newArray.length - 1; i++) {
				newArray[i] = c[i];
			}
			
			newArray[counter - 1] = customerBean;
			
			c = newArray;
		}
	}
	
	public CustomerBean[] viewAllCustomers() {
		return this.c;
	}
	
	public CustomerBean searchCustomerById(long id) {
		CustomerBean cb = new CustomerBean();
		for(int i = 0; i < c.length; i++) {
			if(c[i].getCustomerId() == id) {
					cb = c[i];
			}
		}
		return cb;
	}
}
