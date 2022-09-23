/**
 * 
 */
package com.cogent.arrays;

import java.util.Scanner;

/**
 * @author Norberto Gomez
 * @date: Sep 22, 2022
 *	
 * 
 */

/*
 *  DS3.1 WAP to Search an Element in an Array
 */
public class SearchArray {
	public static void main(String[] args) {
		int[] arr = {32,56,78,12,3,7};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value to find in the array: ");
		int x = sc.nextInt();
		boolean found = false;
		
		for (int i = 0; i < arr.length; i++) {
			if(x == arr[i]) {
				System.out.println("Element " + x + " is on the array index of: " + i);
				found = true;
			} 
		}
		
		if(!found) {
			System.out.println("Element " + x + " isn't on the list");
		}
		
	}
}
