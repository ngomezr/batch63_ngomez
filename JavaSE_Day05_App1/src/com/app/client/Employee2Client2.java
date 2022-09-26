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
public class Employee2Client2 {
	public static void main(String[] args) {
		
		Employee2[] e = new Employee2[10];
		
		Employee2 e1 = new Employee2(100, "Raju", 100, "raju@gmail.com");
		Employee2 e2 = new Employee2(200, "Raku", 110, "raju@gmail.com");
		Employee2 e3 = new Employee2(300, "Natsu", 120, "raju@gmail.com");
		
		e[0] = e1; e[1] = e2; e[2] = e3;
		
		System.out.println(e.length);
		// Only 3 elements exist at the moment
		for (int i = 0; i < 3; i++) {
			System.out.println(e[i].display());
		}
		
	}
}
