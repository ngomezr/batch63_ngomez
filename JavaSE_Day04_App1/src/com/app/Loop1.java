/**
 * 
 */
package com.app;

import java.util.Iterator;

/**
 * @author Norberto Gomez
 * @date: Sep 22, 2022
 * 
 * 
 */
public class Loop1 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("("+ i + ", "+ j +")" + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
