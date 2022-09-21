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
 * DS2.6
 * 
 */
public class NthPower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a base number: ");
		int x = sc.nextInt();
		
		System.out.print("Please enter a number to power to: ");
		int y = sc.nextInt();
				
		System.out.println("Base " + x + " to the " + y + "th Power, total: " + findSum(x,y));
	}
		
	static int findSum(int x, int y) {
		if(y == 0) {
			return 1;
		}
		return x * findSum(x, y-1);
	}
}
