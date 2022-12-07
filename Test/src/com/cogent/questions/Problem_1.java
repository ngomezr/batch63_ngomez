/**
 * 
 */
package com.cogent.questions;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Norberto Gomez
 * @date: Dec 1, 2022
 *	
 * 
 */

/*
 * Given an array of n elements. Find TWO elements in the array such that their sum is equal to given element K.
 */

public class Problem_1 {
	public static void main(String[] args) {
		int[] elements = {12,1, 13, 5, 4, 2, 20};
		int k = 5;
		int[] result = twoElements(elements, k);	
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.print("= " + k);
		System.out.println();
//		------------------------------------------
		findElements(elements, k);
	}
	
//	n+n = n2
//	k-k;
	public static int[] twoElements(int[] array, int k) {
		int[] twoSum = new int[2];
		int temp = 0;
		int sum = 0;
		for (int i = 1; i < array.length; i++) {
			sum = array[temp] + array[i];
//			System.out.println(sum);
			if (sum == k) {
				twoSum[0] = array[temp];
				twoSum[1] = array[i];
				break;
			} else if(i == array.length - 1) {
				temp++;
				i = 1;
			}
		}
		return twoSum;
	}
	
	// Jason Tran Implementation
	public static void findElements(int[] arr, int k) {
		Set<Integer> s = new HashSet<Integer>();
		for(int i : arr) {
			if(s.contains(k-i)) {
				System.out.println("The two addends are " + i + " and " + (k - i));
				break;
			} else {
				s.add(i);
			}
		}
	}
	
}
