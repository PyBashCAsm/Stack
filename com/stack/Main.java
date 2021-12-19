package com.stack;

import com.stack.InputStream;

public class Main {

	public static void main (String[] args) throws Exception {
		InputStream stdin=new InputStream(args[0]);
		String a=" ";
		do {
			a=stdin.getWord();
			System.out.println(a);
		} while(a!=null);
	}
}
