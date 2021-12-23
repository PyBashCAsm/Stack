package com.stack;

import com.stack.exceptions.StackOverflowException;
import com.stack.exceptions.StackEmptyException;

import java.util.ArrayList;

public class Stack <T>  {
	private final int caps;
	private final ArrayList<T> stack;
	private int stackIndex=-1;
	public Stack  (int capacity){
		caps=capacity;
		stack=new ArrayList<>(caps);
	}
	public Stack (){
		caps=30;
		stack=new ArrayList<>(caps);
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
	public T pop(){
		T ret;
		if (stackIndex==-1)
			throw new StackEmptyException();
		else {
			ret=stack.get(stackIndex);
			stack.remove(stackIndex);
			--stackIndex;
		}
		return ret;
	}
	public void displayContents(){
		System.out.print("[ ");
		for (int i=0;i<=stackIndex;i++){
			System.out.print(stack.get(i).toString());
			System.out.print(" ");
		}
		System.out.print(" ]");
	}
}
