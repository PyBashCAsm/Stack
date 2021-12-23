package com.stack;

import com.stack.exceptions.NoSuchInstructionException;
import com.stack.exceptions.InvalidValueException;
import com.stack.exceptions.TooFewArgsException;
import java.io.IOException;

public class Parser {

	private final InputStream input;
	private final Exec ex;

	public Parser(InputStream is,Exec ex){
		input=is;
		this.ex=ex;
	}

	private enum Instructions {
		LOAD,
		MLOAD,
		REMOVE
	}

	private Number parseNum(String parse){
		try    
		{ 
			int num=Integer.parseInt(parse); 
			return num;
		}
		catch(NumberFormatException e)
		{               
			try { 
				double dnum=Double.parseDouble(parse);
				return dnum;
			}
			
			catch (NumberFormatException err){  
				return null;
			}        
		}
	}

	public boolean parseAndExec() throws IOException,NoSuchInstructionException,InvalidValueException,TooFewArgsException {
		String read=input.getWord();
		if (read==null) {
			input.close();
			return false;
		}
		else if (read.length()==0) return true;

		else {
			int numArgs=0;
			Instructions ins;
			boolean varArgs=false;

			switch(read){
				case "load":
					ins=Instructions.LOAD;
					numArgs=1;
					break;
				case "mload":
					ins=Instructions.MLOAD;
					varArgs=true;
				case "remove":
					ins=Instructions.REMOVE;
					numArgs=0;
					break;
				case "add" :
					ex.add();
					return true;

				case "print":
					ex.print();
					return true;

				default:
					throw new NoSuchInstructionException(read);
			}

			Number[] args=new Number[numArgs];
			for (int i=0;i<numArgs;i++){
				String arg=input.getWord();
				Number num;
				if (arg==null)
					throw new TooFewArgsException(numArgs,ins.name());
				if ((num=parseNum(arg))==null)
					throw new InvalidValueException(arg,ins.name());
				else
					args[i]=num;
			}

			switch (ins){
				case LOAD:
					ex.load(args);
					break;
				case REMOVE:
					ex.remove();
					break;
			}

		}

		return true;

	}
}
