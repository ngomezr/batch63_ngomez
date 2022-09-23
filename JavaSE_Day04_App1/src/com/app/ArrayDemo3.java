/**
 * 
 */
package com.app;

import java.util.Scanner;

/**
 * @author Norberto Gomez
 * @date: Sep 22, 2022
 *	
 * 
 */
public class ArrayDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size for the array: ");
		int x = sc.nextInt();
		int arr[] = new int[x];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter an element for the array: ");
			arr[i] = sc.nextInt();
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
		
 	}
}
