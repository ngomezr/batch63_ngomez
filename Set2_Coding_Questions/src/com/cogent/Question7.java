/**
 * 
 */
package com.cogent;

import java.util.Stack;

/**
 * @author Norberto Gomez
 * @date: Nov 22, 2022
 * 
 * 
 */

/*
 * TODO: Question from JPMC. 7. Write a java code to check balanced parentheses
 * in an expression using stack.
 * 
 * Given an expression containing characters ‘{‘,’}’,'(‘,’)’,'[‘,’]’. We have to
 * write a code to check whether an input string has valid parentheses.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets. Open brackets must
 * be closed in the correct order.
 * 
 * Example –
 * 
 * i) {[]}) – Invalid
 * 
 * ii) {()}[] – Valid
 * 
 */
public class Question7 {
	public static void main(String[] args) {
		
	// Example for the process
		String str = "{[]})";// Returns: Not balanced
//		String str = "{[]}"; // Returns: Balanced

		// Declare a stack
		Stack<Character> st = new Stack<>();

		// Traverse a string
		for (int i = 0; i < str.length(); i++) {

			/*
			 * If the current character is starting bracket, then push them in a stack
			 */
			if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
				st.push(str.charAt(i));
				/*
				 * Else, If the stack is not empty, And current character is a closing bracket
				 * and top character of a stack is matching open bracket then pop it.
				 */
			} else if (!st.empty() && ((str.charAt(i) == ']' && st.peek() == '[')
					|| (str.charAt(i) == '}' && st.peek() == '{') || (str.charAt(i) == ')' && st.peek() == '('))) {

				st.pop();

			} else {
				st.push(str.charAt(i));
			}
		}

		if (st.empty()) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not balanced");
		}
	}
}
