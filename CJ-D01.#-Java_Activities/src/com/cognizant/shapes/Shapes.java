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
public class Shapes {
	void calculateShapeArea() {
		
	}
}

class Circle {
	void calculateArea(int radius) {
		System.out.println("The Area of the Circle is " + 3.14 * radius * radius);
	}
}

class Square {
	void calculateArea(int sides) {
		System.out.println("The Area of the Square is " + 0.433 * sides * sides);
	}

}

class Triangle {
	void calculateArea(int sides) {
		System.out.println("The Area of the Triangle is " + sides * sides);
	}
}

