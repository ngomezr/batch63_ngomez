/**
 * 
 */
package com.cogent;

/**
 * @author Norberto Gomez
 * @date: Nov 22, 2022
 *	
 * 
 */
public class Question2 {
	/*
	 * TODO:
	 * 2. How to swap 2 numbers without using 3rd variable?
	 */
	
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println("1st: " + a + " 2nd: " + b);
		a = a + b;// a = 15
		b = a - b;// b = 5 
		a = a - b;// a = 10
		
		// After swap of 2 number positions
		System.out.println("1st: " + a + " 2nd: " + b);

	}

}
