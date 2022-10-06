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
public class Z {
	public static void main(String[] args) {
		String s1 = "abc123xyz";
		System.out.println(s1.length()); // 9 
		System.out.println("-------------");
		System.out.println(s1.charAt(0));// a
		System.out.println(s1.charAt(3));// 1
		System.out.println(s1.charAt(9));// Error because there's 9 values but index starts at 0 meaning 
		// 0-8 
	}
}
