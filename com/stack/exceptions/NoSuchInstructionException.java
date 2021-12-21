package com.stack.exceptions;

public class NoSuchInstructionException extends RuntimeException {
	public NoSuchInstructionException(String ins){
		super(ins+" is not a valid instruction");
	}
}
