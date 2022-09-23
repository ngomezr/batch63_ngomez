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
 * DS3.6.WAP to Remove Duplicate Elements From an Array
 */
public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 45, 2, 23, 33, 12 };

		int temp = 0;
		int length = arr.length; // Make a extra variable for length for later size manipulation
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] == arr[j]) {
					temp = arr[length - 1];
					arr[length - 1] = arr[j];
					arr[j] = temp;
					length--; // Shortens the list (Not literally, since arrays sizes are fixed)
					// Therefore for next output the duplicate will not display
				}
			}
		}

		System.out.print("Sorted Array(Descen): ");

		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
