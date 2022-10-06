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
public class T {
	public static void main(String[] args) {
		String s1 = "ja";
		String s2 = "va";
		String s3 = s1.concat(s2); // makes --> java
		String s4 = "java";
		String s5 = "java";
		System.out.println(s3); // Testing if it does return 'java'
		System.out.println(s3 == s4); // False, because concat does create the same String but they have both come
										// from a different memory
		System.out.println(s4 == s5); // True, they share the same memory since contents are the same.
//		------------------------------------------
		new V().printTest();
	}
}

class V {
	void printTest() {
		String s1 = "null";
		System.out.println(s1.length());
		// Shoudl return 4, because it could the length based off the 
		// char is has.....even the spaces
	}
}
