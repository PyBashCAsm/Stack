package com.stack.exceptions;

public class StackEmptyException extends RuntimeException {
	public StackEmptyException(){
		super("Cannot remove items from stack - Stack is empty");
	}
}
