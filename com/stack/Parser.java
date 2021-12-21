package com.stack;

import com.stack.exceptions.NoSuchInstructionException;
import com.stack.exceptions.InvalidValueException;
import java.io.IOException;

public class Parser {

	private final InputStream input;
	private final Exec ex;

	public Parser(InputStream is,Exec ex){
		input=is;
		this.ex=ex;
	}

	private enum Instructions {
		INS_LOAD,
	}

	public boolean parseAndExec() throws IOException {
		String read=input.getWord();
		if (read==null) return false;

		else if (read.length()==0) return true;

		else {
			int numArgs=0;
			Instructions ins=null;

			switch(read){
				case "load":
					ins=Instructions.INS_LOAD;
					numArgs=1;
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
				String tmp=input.getWord();

				try
				{
					int num=Integer.parseInt(tmp);
					args[i]=num;
				}
				catch(NumberFormatException e)
				{
					try {
						double dnum=Double.parseDouble(tmp);
						args[i]=dnum;
					}
					catch (NumberFormatException err){
						throw new InvalidValueException(tmp, ins.name());
					}
				}
			}

			switch (ins){
				case INS_LOAD :
					ex.load(args);
					break;
			}

		}

		return true;

	}
}
