package com.stack.exceptions;

import java.lang.RuntimeException;

public class StackOverflowException extends RuntimeException {
	public StackOverflowException(){
		super("The stack has overflowed. Exiting immediately...");
	}
}


