/**
 * 
 */
package com.sapient.model;

import java.io.Serializable;

/**
 * @author jxu1
 *
 */
public class User implements Serializable {
	private String fname;
	private String lname;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public boolean validateLogin(String username, String password) {
		if (username.equals("jiajuxu") && password.equals("hunter2")) {
			fname = "Jiaju";
			lname = "Xu";
			return true;
		}
		return false;
	}
}
