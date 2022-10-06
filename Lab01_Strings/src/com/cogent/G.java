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
public class G {
	public static void main(String[] args) {
		String s1 = "cogenttech";
		System.out.println(s1.startsWith("cogent")); // true
		System.out.println(s1.startsWith("123")); // false
		System.out.println(s1.endsWith("te")); // false
		System.out.println("done");
	}
	/*
	 * true if the character sequence represented by the argument is a prefix
	 * of the character sequence represented by this string; false otherwise
	 */
}
