package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.IntStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

	final private IntStack temp = new IntLinkedList();

	public FIFORhymer() {
		super();
	}

	@Override
	public int countOut() {
		while (!callCheck())
			temp.push(super.countOut());

		int ret = temp.pop();

		while (!temp.isEmpty())
			countIn(temp.pop());

		return ret;
	}
}
