package com.sapient.client.cui;

public class HR {
	public Employee recruit(String empType) {
		if (empType.equals("I")) {
			return new Intern();
		} else if (empType.equals("C")) {
			return new Confirmed();
		} else if (empType.equals("T")) {
			return new Contract();
		}
		return null;
	}
}