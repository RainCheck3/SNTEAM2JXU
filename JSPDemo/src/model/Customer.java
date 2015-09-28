package model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Customer implements Serializable{
	private String fname;
	private String lname;
	private Integer salary;
	
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
	
	public String getFullName() {
		return fname + " " + lname;
	}
	
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Map getDetails() {
		Map<Integer, String> result = new HashMap<Integer, String>();
		
		result.put(1, "Taylor");
		result.put(2, "Swift");
		result.put(3, "is the best");
		
		return result;
	}
	
}
