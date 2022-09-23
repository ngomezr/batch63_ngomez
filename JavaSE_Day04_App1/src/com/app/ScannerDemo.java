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

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter X and Y values: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = x+y;
		System.out.println("z value is: " + z);
		
		//Auto closer Interface (Feature added on Java 7)
		
		
	}
}
