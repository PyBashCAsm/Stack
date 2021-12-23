package com.stack.exceptions;

public class NoSuchInstructionException extends SyntaxException {
	public NoSuchInstructionException(String ins){
		super(ins+" is not a valid instruction");
	}
}
