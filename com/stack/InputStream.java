package com.stack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputStream {
	private final BufferedReader input;
	public InputStream(String filename) throws IOException {
		input=new BufferedReader(new FileReader(filename));
	}
	public String getWord() throws IOException {
		if (!input.ready()) return null;
		char next=0;
		StringBuilder sb=new StringBuilder();
		while(input.ready()){
			next=(char)input.read();
			if (next==' ')
				break;
			else 
				sb.append(next);
		}
		return sb.toString();
	}

}
