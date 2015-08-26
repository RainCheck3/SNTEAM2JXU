package com.sapient.client.cui;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

class WordCount {
	public static int words = 0, lines = 0, chars = 0;

	public static void wc(InputStreamReader isr) throws IOException {
		int c = 0;
		boolean lastWhite = true;
		String whiteSpace = " \t\n\r";

		
		while ((c = isr.read()) != -1) {
			chars++; // count characters

			if (c == '\n') {
				lines++; // count lines
			}
			// Count words by detecting the start of a word
			int index = whiteSpace.indexOf(c);
			if (index == -1) {
				if (lastWhite == true) {
					++words;
				}
				lastWhite = false;
			} else {
				lastWhite = true;
			}
		}
		if (chars != 0) {
			++lines;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		try {
			if (args.length == 0) { // We're working with stdin
				wc(new InputStreamReader(System.in));
			} else { // We're working with a list of files
				for (int i = 0; i < args.length; i++) {
					fr = new FileReader(args[i]);
					wc(fr);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(words + " words, " + lines + " lines, " + chars + " chars");
	}
}
