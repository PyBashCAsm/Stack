package com.stack;

import com.stack.exceptions.StackOverflowException;

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
	private boolean stackEmpty(){
		if (stackIndex<caps) 
			return true;
		else 
			return false;
	}
	public void add(T item){
		if (stackEmpty()) {
			stack.add(item);
			stackIndex++;
		}
		else throw new StackOverflowException();
	}
}
