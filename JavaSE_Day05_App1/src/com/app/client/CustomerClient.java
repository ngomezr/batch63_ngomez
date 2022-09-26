/**
 * 
 */
package com.app.client;

import com.bean.Customer;

/**
 * @author Norberto Gomez
 * @date: Sep 23, 2022
 *	
 * 
 */
public class CustomerClient {
	public static void main(String[] args) {
		
		Customer c1 = new Customer(123, "Ex1", "California", "231312321");
		System.out.println(c1.display());
		
		Customer[] cus = new Customer[3];
		
		Customer c2 = new Customer(1, "Ex2", "New Mexico", "231312321");
		Customer c3 = new Customer(2, "Ex3", "Texas", "2342324567");
		Customer c4 = new Customer(3, "Ex4", "New York", "4325673234");
		
		cus[0] = c2; cus[1] = c3; cus[2] = c4;
		
		for (int i = 0; i < cus.length; i++) {
			System.out.println(cus[i].display());
		}
		
	}
}
