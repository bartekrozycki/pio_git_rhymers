package edu.kis.vh.nursery.stack;

public class IntListStack implements IntStack {

	private static final int EMPTY_RETURN_VALUE = StackConfig.EMPTY_RETURN_VALUE;
	private Node last;

	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_RETURN_VALUE;
		return last.getValue();
	}

	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_RETURN_VALUE;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
