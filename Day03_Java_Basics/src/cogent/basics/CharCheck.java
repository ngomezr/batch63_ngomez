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
public class CharCheck {
	public static void main(String[] args) {
		// 8. 
		char letter = 'u';
		char[] vowels = {'a','e','i','o','u'};
		int result = 0;
		
		for(int i = 0; i < vowels.length; i++) {
			if(letter == vowels[i]) {
				result++;
			}
		}
		
		if(result == 1) {
			System.out.println("Character is a vowel");
		} else {
			System.out.println("Character is a constant");
		}
	}
}
