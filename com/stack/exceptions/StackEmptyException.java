package com.stack.exceptions;

import com.stack.exceptions.StackException;

public class StackEmptyException extends StackException {
	public StackEmptyException(){
		super("Cannot remove items from stack - Stack is empty");
	}
}
