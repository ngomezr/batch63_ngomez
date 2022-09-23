/**
 * 
 */
package com.cogent.arrays;

/**
 * @author Norberto Gomez
 * @date: Sep 22, 2022
 *	
 * 
 */

/*
 * DS3.2 WAP to Find the Largest Element in an Array
 */
public class SearchLargest {
	public static void main(String[] args) {
		int[] arr = {23, 12, 45, 2, 9, 100, 1028, 32, 60};
		
		int largest = 0;
		for (int i = 0; i < arr.length; i++) {
			if(largest <= arr[i]) {
				largest = arr[i];
			}
		}
		System.out.println(largest);
	}
}
