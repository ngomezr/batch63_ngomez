/**
 * 
 */
package com.cognizant.shapes;

/**
 * @author Norberto Gomez
 * @date: Sep 20, 2022
 *	
 * 
 */
public class AreaCalculator {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.calculateArea();
		// Doesn't work because static -> non-static (Must Object creation)
//		Rectangle.calculateArea();	
	}
}
