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
 * 	DS3.7.WAP to Merge Two Arrays
 * 
 */
public class MergeArrays {
	public static void main(String[] args) {
		int[] arrayA = {12,43,66,33,56};
		
		int[] arrayB = {22,83,76,43,13};
		
		int[] mergeList = new int[arrayA.length + arrayB.length];
		
		System.out.print("List of arrayA: ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
			mergeList[i] = arrayA[i];
		}
		System.out.println();
		System.out.print("List of arrayB: ");
		
		for (int i = 0; i < arrayB.length; i++) {
			System.out.print(arrayB[i] + " ");
			mergeList[arrayA.length + i] = arrayB[i];
		}
		System.out.println();
		System.out.print("Merge List: ");
		
		for (int i : mergeList) {
			System.out.print(i+ " ");
		}
	}
}
