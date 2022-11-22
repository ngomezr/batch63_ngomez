/**
 * 
 */
package com.cogent;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Norberto Gomez
 * @date: Nov 22, 2022
 *	
 * 
 */
public class Question1 {

	/* TODO: 
	 * 1. Remove All occurrences of given character from String?(Assume Accordingly)
	 */
	
	public static void main(String[] args) {
//		Example#1
		String s1 = "Hello";
		char c = 'H';
		System.out.println("Example#1: " + reModel(s1, c));
//		------------------------------------------------------
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s2 = scanner.nextLine();
		System.out.print("Remove All Occurrences, Enter a given Character: ");
		String c2 = scanner.next();
		char c2_1 = c2.charAt(0);
		
		System.out.println("\nNew String: " + reModel(s2, c2_1));
//		------------------------------------------------------
	}
		
	public static String reModel(String input, char c) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) != c) {
				sb.append(input.charAt(i));
			}
		}
		return sb.toString();
	}
	
}
