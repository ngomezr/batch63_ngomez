/**
 * 
 */
package com.cogent.activity_01;

/**
 * @author Norberto Gomez
 * @date: Sep 20, 2022
 *	
 * 
 */
public class MyProgram {
	public static void main(String[] args) {
		/*
		 * D01.01 Java_Activity
		 */
//		System.out.println("My First Java Program");
		
		/*
		 * D01.02 Java_Activity
		 */
//		MyProgram program = new MyProgram();
//		program.printMessage();
		
//		^^^^^^^ Incorrect 
		
		//(One class)  (Another Class)
		// static  --> non-static, therefore (Object Creation)
		DisplayMessage m1 = new DisplayMessage();
		m1.printMessage();
	}
}
