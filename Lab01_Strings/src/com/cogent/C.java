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
public class C {
	public static void main(String[] args) {
		String s1 = "cogenttechnology";
		String s2 = s1.substring(5); // ttechnology
		String s3 = s1.substring(5, 9);// ttec
		System.out.println(s2); // cogent
		System.out.println("---------");
		System.out.println(s3); //ttec
		System.out.println("---------------");
	
//		(starting, upToINDEX);
	}
}
