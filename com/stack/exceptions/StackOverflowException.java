package com.stack.exceptions;

import com.stack.exceptions.StackException;

public class StackOverflowException extends StackException {
	public StackOverflowException(){
		super("The stack has overflowed. Exiting immediately...");
	}
}


