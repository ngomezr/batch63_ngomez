/**
 * 
 */
package com.cogent;

/**
 * @author Norberto Gomez
 * @date: Nov 22, 2022
 *	
 * 
 */
public class Question3 {
	/*
	 * TODO:
	 * 3. How to remove whitespaces from a string?
	 */
	public static void main(String[] args) {
		// trims the trailing and leading spaces
	    //string with single trailing and leading spaces
	    String s = " Hey! Let us learn Java! ";
	    System.out.println(s.trim());
	      
	    //string with multiple trailing and leading spaces
	    String s1 = "    Learning Java is fun!   ";
	    System.out.println(s1.trim());
	}
}
/*
 * NOTE:
 * For trim() method, space character is a character having ASCII values <= 32. 
 * The Unicode value of space character is '\u0020'. 
 * It removes all characters between '\u0000' (NUL) and '\u0020' (SPACE) from the start and end of the string. 
 * It checks for these Unicode values at the beginning and end of the string. 
 */
