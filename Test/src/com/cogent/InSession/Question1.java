/**
 * 
 */
package com.cogent.InSession;

/**
 * @author Norberto Gomez
 * @date: Dec 6, 2022
/
 
/*
 * 1 ... 10 or 1 ... 50 
 * Q1: How to find a missing number from an Integer Array?
 * 	   What if its asked to find 2 missing numbers? 
 *	   What if the integer array has duplicate numbers too?
 * 	  Source: https://www.geeksforgeeks.org/find-the-missing-number/  
 * 
 */
public class Question1 {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 7, 6, 2 }; // 1 to 7 (order is random)
		int n = arr.length;

		// Function call
		missingValue(arr, n);
//	      --------------------------------------------------------
		
	}

	/*
	 * 5 approaches...using Hashing numbers.
	 */
	public static void missingValue(int arr[], int N) {
		/*
		 * 	Create a temp array temp[] of size n + 1 with all initial values as 0.
			Traverse the input array arr[], and do following for each arr[i] 
			if(temp[arr[i]] == 0) temp[arr[i]] = 1 
			Traverse temp[] and output the array element having value as 0 (This is the missing element).
		 */
		int temp[] = new int[N + 1]; // Temporary array
		System.out.println("N size: " + N + "\n" +"Temp Array Size: " + temp.length);
		
		// This array populates with 0 but with an addition index
		for (int i = 0; i <= N; i++) {
			temp[i] = 0;
			System.out.println(temp[i]); // Testing purpose
		}

		System.out.println("-------------------------");
		for (int i = 0; i < N; i++) {
			/*
			 * temp[1 - 1] = 1
			 * temp[3 - 1] = 1
			 * temp[7 - 1] = 1
			 * temp[5 - 1] = 1
			 * temp[6 - 1] = 1
			 * temp[2 - 1] = 1
			 */
			temp[arr[i] - 1] = 1;
			System.out.println(temp[i]);
		}

		int ans = 0;
		for (int i = 0; i <= N; i++) {
			if (temp[i] == 0)
				ans = i + 1;
		}
		System.out.println(ans);
	}
}
