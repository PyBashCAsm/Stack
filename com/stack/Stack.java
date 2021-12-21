package com.stack;

import com.stack.exceptions.StackOverflowException;
import com.stack.exceptions.StackEmptyException;

import java.util.ArrayList;

public class Stack <T>  {
	private final int caps;
	private final ArrayList<T> stack;
	private int stackIndex;
	public Stack  (int capacity){
		caps=capacity;
		stack=new ArrayList<>();
		stackIndex=0;
	}
	private boolean stackNotFull(){
		return stackIndex < caps;
	}
	public void push(T item){
		if (stackNotFull()) {
			stack.add(item);
			stackIndex++;
		}
		else throw new StackOverflowException();
	}
	public void pop(){
		if (stackIndex==0) 
			throw new StackEmptyException();
		else {
			stack.remove(stackIndex);
			--stackIndex;
		}
	}
	public void displayContents(){
		System.out.print("[ ");
		for (int i=0;i<stackIndex;i++){
			System.out.print(stack.get(i).toString());
			System.out.print(" ");
		}
		System.out.print(" ]");
	}
}
