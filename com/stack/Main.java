package com.stack;

import com.stack.exceptions.CmdLineException;
import com.stack.exceptions.SyntaxException;
import com.stack.exceptions.StackException;

public class Main {

	public static void main (String[] args) throws Exception {
		int insNo=1;
		String arg,stackSize=null;
		try {
			ParseArgs pa=new ParseArgs(args);
			arg=pa.getArgsForOpt("-f");
			stackSize=pa.getArgsForOpt("-s");
			Parser ps;
			if (arg==null) {
				if (stackSize==null) 
				ps = new Parser(new InputStream(args[0]), new Exec(new Stack<Number>()));
				else 
					ps=new Parser(new InputStream(args[0]),new Exec(new Stack<Number>(Integer.parseInt(stackSize))));
			}
			else
				ps= new Parser(new InputStream(arg),new Exec(new Stack<Number>(Integer.parseInt(stackSize))));
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
			System.exit(-1);
		}
		catch (SyntaxException e){
			System.out.println("Error at Instruction "+insNo+": "+e.getMessage());
			System.exit(-1);
		}
		catch (StackException e){
			System.out.println("Fatal error: "+e.getMessage());
			System.exit(-1);
		}
	}
}
