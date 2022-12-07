/**
 * 
 */
package com.cogent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Norberto Gomez
 * @date: Sep 30, 2022
 *	
 * 
 */
public class FileInputStreamDemo2 {
	// Buffer reader
	// LOok into it
	
	public static void main(String[] args) {
		File file = new File("data.txt");
	
		byte b;
	
//		for (int i = 0; i < b.length; i++) {
//			System.out.print((char)b[i]);
//		}
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
					
			int ch = fis.read();
			while((ch) != -1) {
				System.out.print((char)ch);
				ch = fis.read();
			}
			System.out.println(); 
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e1) {
			System.out.println(e1);
		} 			
	}
}
