/**
 * 
 */
package com.cogent.questions;

import java.util.Iterator;

/**
 * @author Norberto Gomez
 * @date: Nov 22, 2022
 *	
 * 
 */
public class Palindrome {
	static boolean isPalindrome(String s) {
		int[] cnt = new int[128];
		for(int i = 0; i < s.length(); i++) {
			cnt[s.charAt(i)]++;
		}
		int numOfOdds = 0;
		for(int i = 0; i < cnt.length; i++) {
			if(cnt[i]%2 !=0) {
				numOfOdds++;
			}
			if(numOfOdds > 1) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("ababc") ? "Yes" : "No");
	}

}
