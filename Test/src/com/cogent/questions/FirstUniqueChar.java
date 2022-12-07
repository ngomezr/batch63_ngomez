/**
 * 
 */
package com.cogent.questions;

import java.util.Iterator;

/**
 * @author Norberto Gomez
 * @date: Nov 30, 2022
 *	
 * 
 */

/*
 * First Unique Char of a String
 */

public class FirstUniqueChar {
	public static void main(String[] args) {
		String ex1 = "aaakaa";
		
		StringBuilder sb = new StringBuilder(ex1);		
		char[] temp = new char[ex1.length()];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = sb.charAt(i);
		}
		
		for (int i = 0; i < temp.length; i++) {
			char c = temp[i];
			System.out.println(c);
		}
		
		System.out.println(firstUniqueChar(temp));
	}
	
	public static int firstUniqueChar(char[] s) {
	    int size = s.length;
	    for(int i = 0; i < size; i++) {
	        boolean found = true;
	        for(int j = i+1; j < size; j++){
	            if(s[i] == s[j]){
	                found = false;
	                break;
	            }
	        }
	        if(found == true){
	            return i;
	        }
	    }
	    return -1;
	}
}
