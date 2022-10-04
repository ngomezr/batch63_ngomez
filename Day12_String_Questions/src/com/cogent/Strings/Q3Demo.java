/**
 * 
 */
package com.cogent.Strings;

import java.util.Scanner;

/**
 * @author Norberto Gomez
 * @date: Oct 4, 2022
 *	
 * 
 */
public class Q3Demo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an input: ");
		String inputStr = "";
		
		if(scanner.hasNextInt()) { // Check if the value input HAS an int 
			System.out.println("Value is an Integer");
		} else { // If no integer is found and then stores the String input to inputStr
			inputStr = scanner.nextLine();
		}
	
		System.out.println(inputStr); // Print out String values once validated
	}
}
