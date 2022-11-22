/**
 * 
 */
package com.cogent;

import java.util.Arrays;

/**
 * @author Norberto Gomez
 * @date: Nov 22, 2022
 *	
 * 
 */
public class Question5 {
	/*
	 * TODO:
	 * 5. Find 3rd largest element in an integer array?
	 */
	public static void main(String[] args) {
		int[] a = new int[] { 9, 5, 1, 7 };
		// Sort Array 
		Arrays.sort(a);
		
		if(a.length >= 3) {
			System.out.println("Third Largest Element in Array is: " + a[a.length-3]);
		} else {
			System.out.println("Array is has less than 3 elements! Cannot find 3rd Highest");
		}
	}
}
