/**
 * 
 */
package com.cogent.questions;

/**
 * @author Norberto Gomez
 * @date: Nov 22, 2022
 *	
 * 
 */
public class Boxing_Examples {
	
	public static void test(Long t) {
		System.out.println("Hi");
	}
	
//	public static void test(long t) {
//		System.out.println("Hello");
//	}
	
	public static void test(long ...n) {
		System.out.println("Hello World");
	}
	
	
	public static void main(String[] args) {
		test(10l);
	}

}
