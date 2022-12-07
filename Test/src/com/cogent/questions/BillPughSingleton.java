/**
 * 
 */
package com.cogent.questions;

/**
 * @author Norberto Gomez
 * @date: Nov 30, 2022
 *	
 * 
 */
public class BillPughSingleton {
	
	private BillPughSingleton() {} // Private Constructor 
	
	private static class SingletonHelper { // A static field containing its only instance
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	 public static BillPughSingleton getInstance() { // A static factory method for obtaining the instance
	        return SingletonHelper.INSTANCE;
	    }
}
