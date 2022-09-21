import java.util.Scanner;

/**
 * 
 */

/**
 * @author Norberto Gomez
 * @date: Sep 21, 2022
 *	
 * 
 */
public class ReverseValues {

	/*
	 *  DS2.7
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter values: ");
		int n = sc.nextInt(), reversed = 0;
		//result: 54321
		
		while(n != 0) {
			int temp = n % 10;	// 123 % 10	 temp = 3
			reversed = reversed * 10 + temp;   // 0 * 10 + 3
			
			n /= 10;		// 123 / 10 -> 12
		}
		
		System.out.println("Reverse values: " + reversed);
		
	}
}
