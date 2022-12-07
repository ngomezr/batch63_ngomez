/**
 * 
 */
package com.cogent.test;

/**
 * @author Norberto Gomez
 * @date: Nov 21, 2022
 *	
 */

class Abcd {
	public static final int x;
	
	static {
		x = 10;
		System.out.println("Hello");
	}
}

public class Test_2_Constant {

	static boolean isPowerOfTwo(int n) {
		return (n & (n-1)) == 0;
	}
	
	public static void main(String[] args) {
		System.out.println(Abcd.x);
		
		int n = 16;
		System.out.println(isPowerOfTwo(n));
	}
}
