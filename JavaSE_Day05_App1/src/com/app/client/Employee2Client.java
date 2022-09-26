/**
 * 
 */
package com.app.client;

import com.bean.Employee2;

/**
 * @author Norberto Gomez
 * @date: Sep 23, 2022
 *	
 * 
 */
public class Employee2Client {
	public static void main(String[] args) {
		Employee2 e1 = new Employee2(100, "Raju", 100, "raju@gmail.com");
		
		System.out.println(e1.display());
	}
}
