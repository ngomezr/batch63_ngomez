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
public class ReversedNumber {
	public static void main(String[] args) {
		/*
		 * WAP Accept the number...find the reverse number;
		 */
			
			int n = 123, reversed = 0;
			//result: 321
			
			while(n != 0) {
				int temp = n % 10;	// 123 % 10	 temp = 3
				reversed = reversed * 10 + temp;   // 0 * 10 + 3
				
				n /= 10;		// 123 / 10 -> 12
			}
			
			System.out.println("Reverse number: " + reversed);
			
	}
}
