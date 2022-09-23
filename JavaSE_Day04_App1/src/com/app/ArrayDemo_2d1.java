/**
 * 
 */
package com.app;

/**
 * @author Norberto Gomez
 * @date: Sep 22, 2022
 *	
 * 
 */
public class ArrayDemo_2d1 {
	public static void main(String[] args) {
		// Syntactically column doesn't have to specify 
		// Rows has to be specify;
		int[][] arr0 = new int[2][2];
		
		int[][] arr = {{10,20,30}, {40, 50, 60}, {70,80,90}};
		
		for (int i = 0; i < arr.length; i++) {
		
			for (int j = 1; j < arr.length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
