/**
 * 
 */
package com.app.fin;

/**
 * @author Norberto Gomez
 * @date: Sep 23, 2022
 *	
 * 
 */
class A {
	
	// Constructor
	A() {
		
	}
	// final method
	public final void show3() {
		
	}
	// Instance methid
	void display1() {
		
	}
	// Static method (Call with class name)
	static void display() {
		
	}
	// Abstract methods
	// default methods 
	
	public void show() {
		System.out.println(" Show Method from Class A ");
	}
	
}                             
class B extends A {
	@Override
	public final void show() {
		System.out.println(" Show Method from Class B ");
	}
}

class C extends B {
	public void show1() {
		System.out.println(" Show Method from Class C ");
	}
}

public class Sample {	
	// declared and initialized
	final int MAX = 100;
	public static void main(String[] args) {
//		MAX = MAX + 100; // Cannot do this
		System.out.println(new Sample().MAX);
	
	}
}
