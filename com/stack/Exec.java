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
	public void remove (){
		stack.pop();
	}
	public void print(){
		stack.displayContents();
	}
	public void add(){
		stack.push(stack.pop().doubleValue()+stack.pop().doubleValue());
	}
}
