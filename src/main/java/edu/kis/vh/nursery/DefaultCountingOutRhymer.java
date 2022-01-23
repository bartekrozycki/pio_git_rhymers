package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntStack;

public class DefaultCountingOutRhymer {

	final private IntStack stack;

	public DefaultCountingOutRhymer(IntStack stack) {
		this.stack = stack;
	}

	public DefaultCountingOutRhymer() {
		stack = new IntArrayStack();
	}

	public void countIn(int in) {
		stack.push(in);
	}

	public boolean callCheck() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int peekaboo() {
		return stack.top();
	}

	public int countOut() {
		return stack.pop();
	}

}
