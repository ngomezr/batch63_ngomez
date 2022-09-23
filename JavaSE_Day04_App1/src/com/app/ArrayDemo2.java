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
public class ArrayDemo2 {
	public static void main(String[] args) {
		
		// When declaring the array you have to 
		// initialize the values
		int[] arr0 = {23,12,34,45};
		int[] arr = new int[10];
//		int[] arr2 = new int[];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 10; // populating the spaces of array size 0-9
			System.out.println("array["+i+"]" + " -> " + arr[i]);

		}
		
		// If not populated then it will display 0 for each spaces.
		
		for (int i : arr) {
//			System.out.println(i);
		}
		
	}
}
