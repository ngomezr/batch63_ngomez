/**
 * 
 */
package com.cogent.Strings;

/**
 * @author Norberto Gomez
 * @date: Oct 4, 2022
 *	
 * 
 */
public class Person {
	private int pid;
	private String pname;

	public Person(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + "]";
	}
}
