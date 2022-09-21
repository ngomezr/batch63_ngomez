/**
 * 
 */
package cogent.basics;

/**
 * @author Norberto Gomez
 * @date: Sep 21, 2022
 *	
 * 
 */
public class NumberCheck {
	public static void main(String[] args) {
		int a = 8, b = 7;
		
		// 2.Check if it has a remainder to see if its even or odd		
		if((a%2) == 0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
//		------------ For b 
		if((b%2) == 0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
		
		System.out.println("------------------------------------");
//		---------------Using Ternary Operator---------------------
		// 6.
		int c = 12, d = 13;
		
		System.out.println((c%2) == 0 ? "The number is even" : "The number is odd");

		System.out.println((d%2) == 0 ? "The number is even" : "The number is odd");

	}
}
