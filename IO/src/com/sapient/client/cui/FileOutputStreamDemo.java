package com.sapient.client.cui;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		String source = "Now is the time for all good men\n"
				+ "to come to the aid of their country\n"
				+ " and pay their due taxes.";
		byte buf[] = source.getBytes();
		OutputStream f0 = new FileOutputStream("file1.txt");
		
	}
}
