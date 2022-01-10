package edu.kis.vh.nursery.stack;

public interface IntStack {
	void push(int value);
	int pop();
	int top();
	boolean isFull();
	boolean isEmpty();
}
