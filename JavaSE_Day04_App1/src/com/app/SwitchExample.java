/**
 * 
 */
package com.app;

/**
 * @author Norberto Gomez
 * @date: Sep 22, 2022
 * 
 * 
 */
public class SwitchExample {
	public static void main(String[] args) {
		
		// If no 'break' statement then it will print all.
		// Go through each case.(depending on the case you start on)
		
		int a = 2;
		switch (a) { // Jumping Statement
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("No matching case");
		}
	}
	
	
	
}
