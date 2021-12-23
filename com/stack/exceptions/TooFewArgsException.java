package com.stack.exceptions;

public class TooFewArgsException extends SyntaxException {
	public TooFewArgsException (int numArgs,String name){
		super("Instruction "+name+" requires at least "+numArgs+" arguement(s)");
	}
	public synchronized Throwable fillInStackTrace(){
		return this;
	}
}
