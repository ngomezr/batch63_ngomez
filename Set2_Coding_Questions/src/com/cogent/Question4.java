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
public class Question4 {
	/*
	 * TODO: 4. Check if two arrays contains same elements?
	 */
	public static void main(String[] args) {
		int[] a = new int[] { 1, 5, 7, 9 };
		int[] b = new int[] { 9, 5, 1, 7 };
		int[] c = new int[] { 1, 6, 7, 5 };

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);

		boolean returnVal1 = Arrays.equals(a, b);
		System.out.println("Array a and b equal?: " + returnVal1);

		boolean returnVal2 = Arrays.equals(b, c);
		System.out.println("Array b and c equal?: " + returnVal2);
	}

}
