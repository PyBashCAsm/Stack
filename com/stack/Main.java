package com.stack;

import com.stack.exceptions.CmdLineException;
import com.stack.exceptions.SyntaxException;

public class Main {

	public static void main (String[] args) throws Exception {
		int insNo=1;
		String arg,stackSize=null;
		try {
			ParseArgs pa=new ParseArgs(args);
			arg=pa.getArgsForOpt("-f");
			stackSize=pa.getArgsForOpt("-s");
			Parser ps;
			if (arg==null && stackSize==null)
				ps = new Parser(new InputStream(args[0]), new Exec(new Stack<>()));
			else
				ps= new Parser(new InputStream(arg),new Exec(new Stack<>(Integer.parseInt(stackSize))));
			boolean status;
			do {
				status = ps.parseAndExec();
				insNo++;
			} while (status);
		}
		catch (CmdLineException e){
			System.out.println("Error parsing command line arguments:"+e.getMessage());
			System.exit(-1);
		}
		catch (NumberFormatException e){
			System.out.println("Stack size "+stackSize+" is not valid integer");
		}
		catch (SyntaxException e){
			System.out.println("Error at Instruction "+insNo+": "+e.getMessage());
			System.exit(-1);
		}
	}
}
