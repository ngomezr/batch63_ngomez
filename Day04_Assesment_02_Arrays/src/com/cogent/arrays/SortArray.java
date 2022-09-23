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
 * DS3.3 WAP to Sort an Array /
 * 
 * DS3.5 WAP Sort an Array in Ascending Order
 */
public class SortArray {
	public static void main(String[] args) {
		int[] arr = {34, 23, 42, 2, 33, 55, 12};
		
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.print("Sorted Array: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
