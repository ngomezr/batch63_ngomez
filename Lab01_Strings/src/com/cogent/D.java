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
public class D {
	public static void main(String[] args) {
		String s1 = "cogent";
		String s2 = new String("jayant");
		System.out.println(s1.toString());
		System.out.println(s2.equals(s2));
	}
	/*
	 * Answer: 1. Would be 1st sysout would return "cogent"
	 * 		   2. Then 'true' would be second because both are pointing 
	 * 			  to a new String with same value.
	 * 			  .equals() checks the objects items and if they are the same. 
	 */
}
