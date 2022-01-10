package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

	final private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer(new IntLinkedList());

	@Override
	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());

		int ret = temp.countOut();

		while (!temp.callCheck())
            countIn(temp.countOut());

		return ret;
	}
}
