/**
 * 
 */
package com.cogent.Strings;

import java.util.Iterator;

/**
 * @author Norberto Gomez
 * @date: Oct 4, 2022
 *	
 * 
 */
public class PersonClient {
	public static void main(String[] args) {
		// Within same package no import needed
		Person[] p = new Person[10];
		p[0] = new Person(1, "Amanda");
		p[1] = new Person(2, "Jacob");
		p[2] = new Person(3, "Zack");
		p[3] = new Person(4, "Albert");
		p[4] = new Person(5, "arthur");
		p[5] = new Person(6, "junior");
		p[6] = new Person(7, "Roger");
		p[7] = new Person(8, "Charlie");
		p[8] = new Person(9, "Steve");
		p[9] = new Person(10, "axel");
		
		for (int i = 0; i < p.length; i++) {
			String name = p[i].getPname();
			if(name.charAt(0) == 'A' || name.charAt(0) == 'a') {
				System.out.println(p[i]);
			} else if(name.charAt(0) == 'J' || name.charAt(0) == 'j') {
				System.out.println(p[i]);
			}
		}
		
			
	}
}
