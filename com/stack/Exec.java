package com.stack;


public class Exec {
	private final Stack<Number> stack;
	public Exec(Stack<Number> Stack) {
		this.stack=Stack;
	}
	public void load (Number[] toLoad){
		for (Number i:toLoad) {
			stack.push(i);
		}
	}
	public void print(){
		stack.displayContents();
	}
}
