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
public class I {
	public static void main(String[] args) {
		String s1 = "cogent"; // Literal, cannot have duplicates therefore they point to 
		String s2 = "cogent"; // the same memory location.		
		String s3 = new String(s1); // Non-Literal, can have duplicates but each have different memory reference
		String s4 = new String(s2);
		System.out.println("------");
		System.out.println(s1 == s2); // True because both point to same memory reference
		System.out.println(s3 == s4); // False because == compare there memory reference
		System.out.println(s1 == s4); // False because == compare there memory reference
		System.out.println(s3 == s4); // False because == compare there memory reference
		System.out.println("--------------");
		System.out.println(s1.equals(s2)); // True because they compare actual values
		System.out.println(s1.equals(s3)); // True because they compare actual values
	}
}
