package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntStack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public HanoiRhymer() {
		super();
	}
	public HanoiRhymer(IntStack intStack) {
		super(intStack);
	}

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
