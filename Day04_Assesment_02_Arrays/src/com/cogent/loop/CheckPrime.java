package com.cogent.loop;
/**
 * 
 */

/**
 * @author Norberto Gomez
 * @date: Sep 21, 2022
 *	
 * 
 */

/*
 * DS2.2 
 */
public class CheckPrime {
	public static void main(String[] args) {
		checkPrime(5);
		checkPrime(4);
	}
	
	static void checkPrime(int n) {
		int m = 0, temp = 0;
		m = n / 2; // 4 / 2 --> 2
		
		if(n == 0 || n == 1) {
			System.out.println(n + " is not a prime number");
		} else {
							// 2 <= 2
			for(int i = 2; i <= m; i++) {
				if(n % i == 0) { // 4 % 2 --> 0 
					System.out.println(n + " is not a prime number");
					temp = 1; // sets temp to 1 meaning isn't prime
				}
			}
		}
		// if temp wasn't change throughout the iteration then its prime.
		if(temp == 0) {
			System.out.println(n + " is prime number");
		}
	}
	
}
