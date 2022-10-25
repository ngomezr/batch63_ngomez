/**
 * 
 */
package com.cogent.bean;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author Norberto Gomez
 * @date: Sep 30, 2022
 *	
 * 
 */
public class ObjectOutputStreamDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(12, "NAME", 23464);
		System.out.println(e1);
		File f = new File("object.txt");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(e1);
			System.out.println(" Object is place in the file!... ");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}
}
