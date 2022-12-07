/**
 * 
 */
package com.cogent.questions;

/**
 * @author Norberto Gomez
 * @date: Nov 30, 2022
 *	
 * 
 */

/*
 * Do a Pyramid
 */
public class Pyramid {
	
	public static void main(String[] args) {
		String[][] pyramid = new String[5][5];
		
		int nextLine = 0;

		for (int i = 0; i < pyramid.length; i++) {
			for(int j = 0; j < pyramid.length; j++) {
				pyramid[i][j] = "*";
			}
		}
		
		for (int i = 0; i < pyramid.length; i++) {
			for(int j = 0; j < pyramid.length; j++) {
				System.out.print(pyramid[i][j]);
			}
			System.out.println();
		}
		
	}

}
