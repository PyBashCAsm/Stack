package com.stack;

import com.stack.Stack;

public class Exec {
	private final Stack<Integer> iStack;
	private final Stack<Double> fStack;
	public Exec(Stack<Integer> intStack,Stack<Double> fltStack) {
		iStack=intStack;
		fStack=fltStack;
	}
	public void load (int toLoad){
		iStack.push(toLoad);
	}
	public void load (double toLoad){
		fStack.push(toLoad);
	}
}
