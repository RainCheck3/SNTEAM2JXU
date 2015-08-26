package com.sapient.client.cui;

import java.io.File;
import java.io.IOException;

class FileDemo {
	static void p(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("D:/sapient");
	
		p("File Name: " + f1.getName());
		p("Path: " + f1.getPath());
		p("Parent: " + f1.getParent());
		p(f1.exists() ? "exists" : "does not exist");
		p(f1.canWrite() ? "is writeable" : "is not writeable");
		p(f1.canRead() ? "is readable" : "is not readable");
		p("is " + (f1.isDirectory() ? "" : "not" + " a directory"));
		p(f1.isAbsolute() ? "is absolute" : "is not absolute");
		p("File last modified: " + f1.lastModified());
		p("File size: " + f1.length() + " Bytes");
	}

}
