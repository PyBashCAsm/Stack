package com.stack.exceptions;

public class TooFewArgsException extends RuntimeException {
	public TooFewArgsException (int numArgs,String name){
		super("Instruction "+name+" requires at least "+numArgs+" arguement(s)");
	}
}
