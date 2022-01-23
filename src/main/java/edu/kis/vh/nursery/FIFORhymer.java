package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntListStack;
import edu.kis.vh.nursery.stack.IntStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

	final private IntStack temp = new IntListStack(); // List implementation of IntStack is better because of unlimited size

	public FIFORhymer() {
		super();
	}
	public FIFORhymer(IntStack intStack) {
		super(intStack);
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
