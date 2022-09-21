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

/*
 * DS2.5
 * 
 */

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter any numeric value: ");
		int x = sc.nextInt();
		System.out.println("Factorial of " + x + " is: " + findFactorial(x));
		
	}
	
	static int findFactorial(int n) {
		if(n == 1 || n == 1) {
			return 1;
		} else {
			return n * findFactorial(n - 1);
		}
		
	}

}
