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
public class FindSum {
	public static void main(String[] args) {
		/*
		 * WAP Find sum of first 10 odd and even num.
		 */
		int sumEven = 0;
		int sumOdd = 0;
		for(int i = 0; i <= 10; i++) {
			if((i%2) == 0) {
				sumEven = sumEven + i;
			} else {
				sumOdd = sumOdd + i;
			}
		}
		
		System.out.println("Sum of Even: " + sumEven);
		System.out.println("------------------------");
		System.out.println("Sum of Odd: " + sumOdd);
		System.out.println("------------------------");
		System.out.println("Total Sum: " + (sumEven + sumOdd));
	}
}
