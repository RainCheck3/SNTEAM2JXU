package com.sapient.client.cui;

import java.util.Enumeration;
import java.util.Properties;

//Demonstrate insert().
class A {
	public static void main(String args[]) {
		/*
		Properties properties = System.getProperties();

		Enumeration keys = properties.keys();
		String key;

		while (keys.hasMoreElements()) {
			key = (String) keys.nextElement();
			System.out.println(key + " : " + properties.get(key));
		}*/
		System.out.println(System.getProperty("os.name"));

	}
}