package com.stack;

public class Main {

	public static void main (String[] args) throws Exception {
		int insNo=1;
		try {
			Parser ps = new Parser(new InputStream(args[0]), new Exec(new Stack<>(30)));
			boolean status;
			do {
				status = ps.parseAndExec();
				insNo++;
			} while (status);
		} catch (RuntimeException e){
			System.out.println("Error at Instruction "+insNo+": "+e.getMessage());
			System.exit(-1);
		}
	}
}
