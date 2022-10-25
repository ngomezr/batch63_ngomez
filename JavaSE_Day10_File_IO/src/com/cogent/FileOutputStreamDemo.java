/**
 * 
 */
package com.cogent;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Norberto Gomez
 * @date: Sep 30, 2022
 *	
 * 
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) {
		File file = new File("data.txt");
		
		String s = "Welcome to Cogent Family and taking Java full stack Training!";
		byte b[] = s.getBytes();
	
//		for (int i = 0; i < b.length; i++) {
//			System.out.print((char)b[i]);
//		}
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			fos.write(b);
			System.out.println(" File is created and added some data... ");
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e1) {
			System.out.println(e1);
		} 			
	}
}
