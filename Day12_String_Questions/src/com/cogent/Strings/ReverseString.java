/**
 * 
 */
package com.cogent.Strings;

/**
 * @author Norberto Gomez
 * @date: Oct 4, 2022
 *	
 * 
 */
public class ReverseString {
	public static void main(String[] args) {
		String s1 = "Java is easy";
		String s1Result = reverseString(s1);
		System.out.println("#1 "+s1Result);
//		-------------------------------
		String s2 = "Using String methods";
		String[] temp = s2.split(" ");
 		StringBuilder sb = new StringBuilder();
 		for (int i = temp.length - 1; i > -1; i--) {
			sb.append(temp[i] + " ");
		}
		System.out.println("#2 "+ sb);
//		---------------------------------
		String s3 = "without using String methods";
		String s3Result = reverseString(s3);
		System.out.println("#3 "+ s3Result);
	}
	
	public static String reverseString(String strInput) {
		String[] temp = strInput.split(" ");
		String output = "";
		for (int i = temp.length - 1; i > -1; i--) {
			output += temp[i] + " ";
		}
		return output;
	}
}
