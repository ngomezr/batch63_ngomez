/**
 * 
 */
package com.cogent.test;

/**
 * @author Norberto Gomez
 * @date: Nov 23, 2022
 *	
 * 
 */

// Singleton
class A {
	B obj1;
}

// Prototype
class B {
	
}

// A obj
// A obj1

//obj.obj1 == obj1.obj1;
public class Spring_Test_1 {
	public static void main(String[] args) {
		A a = new A();
		A b = new A();
		
		if(a.obj1 == b.obj1) {
			System.out.println("Hello");
		}
	}
}
