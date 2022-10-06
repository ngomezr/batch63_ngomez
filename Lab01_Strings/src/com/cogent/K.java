/**
 * 
 */
package com.cogent;

/**
 * @author Norberto Gomez
 * @date: Oct 6, 2022
 * 
 * 
 */
public class K {
	public static void main(String[] args) {
		String s1 = "COGENT";
		String s2 = "cogent";
		System.out.println(s1.equals(s2)); // False, since s1 is upper case
		System.out.println("====");
		System.out.println(s1.equals(s2.toUpperCase())); // True, because s2 turn upper case and then they both share same contents
		System.out.println(s1.toLowerCase().equals(s2)); // True, because s1 turns lower case and then they share same contents
		System.out.println("=======");
		System.out.println(s1.equalsIgnoreCase(s2)); // True, since IgnoreCase makes it that if its either upper/lower case it will still compare them naturally based off their word.
		System.out.println("done");
	}
}
