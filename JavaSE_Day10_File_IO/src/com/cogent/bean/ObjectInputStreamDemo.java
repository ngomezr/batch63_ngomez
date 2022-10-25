/**
 * 
 */
package com.cogent.bean;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Norberto Gomez
 * @date: Sep 30, 2022
 *	
 * 
 */
public class ObjectInputStreamDemo {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\gnorb\\Java_Cogent\\Java_SE\\JavaSE_Day10_File_IO\\object.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object o = ois.readObject(); //unmarchling
//			System.out.println(o);
			Employee e = (Employee) o;
			System.out.println(e);
				
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		}
	}
	// Static, final, abstract, Synchronzation, Transient
}
