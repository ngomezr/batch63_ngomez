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

class Car<T> {
	private T t;
	
	public void add(T t) {
		this.t = t;
	}
	
	public T get() {
		return this.t;
	}
}

/*
 * When it goes through type erasure the --> T <-- will be replace by an object
 */

public class GenericsTester {
	public static void main(String[] args) {
		
	}
}
