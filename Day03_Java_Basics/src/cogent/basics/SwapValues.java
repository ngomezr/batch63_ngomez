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
public class SwapValues {
	public static void main(String[] args) {
		int a = 10, b = 20;
		
		// 4.
		System.out.println("A: " + a);
		
		System.out.println("B: " + b);
		
		int temp = b;
		b = a;
		a = temp;
		System.out.println("---After swap---");
		System.out.println("A: " + a);
		
		System.out.println("B: " + b);
		
		System.out.println("------------------------------");
		// ---------Without extra variable--------------
		// 5.
		int c = 12, d = 18;
		
		System.out.println("C: " + c);
		
		System.out.println("D: " + d);

		
		
		
		System.out.println("---After swap---");
		
		System.out.println("C: " + c);
		
		System.out.println("D: " + d);
	}
}
