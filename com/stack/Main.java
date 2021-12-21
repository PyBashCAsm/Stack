package com.stack;

public class Main {

	public static void main (String[] args) throws Exception {
		Parser ps=new Parser(new InputStream(args[0]),new Exec(new Stack<>(30)));
		boolean status;
		do {
			status=ps.parseAndExec();
		} while(status);
	}
}
