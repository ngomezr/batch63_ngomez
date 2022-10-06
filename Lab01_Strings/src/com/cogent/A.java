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
public class A {
	public static void main(String[] args) {
		String s1 = "a1b2c3x1y2x3";
		System.out.println(s1.length()); // 12
		System.out.println(s1.indexOf('2')); // 3, returns where the 2 is placed on the string
		System.out.println(s1.indexOf('x')); // 6
		System.out.println(s1.indexOf('x', 8)); // Starts at index 8 then looks for x which is index 10
		System.out.println(s1.indexOf(2, 3));// index 3 and looks for int 2 but return -1 because there's only strings
	
// if no such character occurs in this string at or after position fromIndex, then -1 is returned. 
	}
}
