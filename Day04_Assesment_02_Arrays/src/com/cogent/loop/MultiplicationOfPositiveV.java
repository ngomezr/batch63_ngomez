package com.cogent.loop;
import java.util.Scanner;

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
 * DS2.4 
 */

public class MultiplicationOfPositiveV {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a positive value: ");
		int setV = sc.nextInt();
		
		for( int a = 0; a <= 10; a++) {
			System.out.println(setV + " x " + a + " = "  + (setV * a));
		}
		
	}
}
