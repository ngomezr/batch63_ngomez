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
public class E {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "Abc";
		String s3 = "xyz";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareToIgnoreCase(s2));
		/*
		 * compareTo compare the Unixcode but 
		 * if the values do equal the same then it will return 0 
		 * meaning that they are truly the same.
		 */
		
	}
}
