package com.stack;

import com.stack.InputStream;
import com.shiva.Exec;

import com.stack.NoSuchInstructionException;

public class Parser {
	private InputStream input;
	public Parser(InputStream is){
		input=is;
	}
	private enum Instructions {
		INS_LOAD,
	};
	public void parseAndExec(){
		String read=is.getWord();
		if (read.length()==0) return;
		int numArgs;
		Instrcution ins;
		else {
			switch(read){
				case "load":
					ins=Instructions.INS_LOAD;
					numArgs=1;
					break;
				default:
					throw new NoSuchInstructionException(read);
			}
		}
	}
}
