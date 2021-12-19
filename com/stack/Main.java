package com.stack;

import com.stack.InputStream;

public class Main {

	public static void main (String[] args) throws Exception {
		InputStream stdin=new InputStream(args[0]);
		String a=" ";
		while (a!=null){
			//System.out.println("Will Read");
			a=stdin.getWord();
			System.out.println(a);
		}
	}
}
