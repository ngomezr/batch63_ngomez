/**
 * 
 */
package com.app;

import java.util.Iterator;

/**
 * @author Norberto Gomez
 * @date: Sep 22, 2022
 *	
 * 
 */
public class ArrayDemo1 {
	public static void main(String[] args) {
		// (type) (reference) (new object)
		// Employee e = new Employee();
		
		// Array is a strict type of syntax 
		/*
		 * Should be understand by the complier or will throw
		 * Exceptions.
		 */
		int[] array = {10,23,56,23,34,56,34,45};
		int sum = 0;
		System.out.println(array[7]);
		System.out.println(array.length);
		
		//Type 1
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			sum = sum + array[i];
			// or
			// sum+=array[i]
		}
		
		System.out.println("\nSum: " + sum);
			
		//Type 2 Java5 ForEach
		sum = 0;
		for (int i : array) {
			System.out.print(i + " ");
			sum = sum + i;
		}
		
		System.out.println("\nSum: " + sum);

		
	}
}
