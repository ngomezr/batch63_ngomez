/**
 * 
 */
package com.cogent;

/**
 * @author Norberto Gomez
 * @date: Oct 6, 2022
 * 
 * 
 */
public class Q {
	public static void main(String[] args) {
		System.out.println(2 + 4); // 6, adds two intergers
		System.out.println(2 + "cogent"); // 2cogent, because when adding to a string it will make the int to a string
		System.out.println("cogent" + null); // cogentnull, String default value is null and it just add the two values together
		System.out.println("cogent" + 2 + null); // cogent2null, add each value to a single String output
	}
}
