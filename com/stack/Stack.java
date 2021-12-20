package com.stack;

import com.stack.exceptions.StackOverflowException;
import com.stack.exceptions.StackEmptyException;

import java.util.ArrayList;

public class Stack <T>  {
	private int caps;
	private ArrayList<T> stack;
	private int stackIndex;
	public Stack  (int capacity){
		caps=capacity;
		stack=new ArrayList<T>();
		stackIndex=0;
	}
	private boolean stackNotFull(){
		if (stackIndex<caps) 
			return true;
		else 
			return false;
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
			stack[stackIndex]=null;
			--stackIndex;
		}
	}
}
