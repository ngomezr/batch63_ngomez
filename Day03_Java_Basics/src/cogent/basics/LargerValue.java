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
public class LargerValue {
	public static void main(String[] args) {
		int a = 100, b = 70;
		
		// 3.
		if( a > b) {
			System.out.println("A is the larger value ");
		} else { 
			System.out.println( "B is the larger value ");
		}
		
		System.out.println("--------------------------");
		// Find Large value out of three numbers
		// 7. 
		int c = 514;
		
		if(a > b && a > c) {
			System.out.println("A is the larger value ");
		} else if(b > a && b > c) { 
			System.out.println( "B is the larger value ");
		} else {
			System.out.println( "C is the larger value ");
		}
	}

}
