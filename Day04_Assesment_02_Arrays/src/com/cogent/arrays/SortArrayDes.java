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
 * DS3.4 WAP Sort an Array in Descending Order
 */
public class SortArrayDes {
	public static void main(String[] args) {
		int[] arr = {34, 23, 42, 2, 33, 55, 12};
		
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length + 2; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.print("Sorted Array(Descen): ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
