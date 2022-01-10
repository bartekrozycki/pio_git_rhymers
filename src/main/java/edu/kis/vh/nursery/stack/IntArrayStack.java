package edu.kis.vh.nursery.stack;

public class IntArrayStack implements IntStack {

	private static final int DEFAULT_CAPACITY = 12;
	private static final int EMPTY_RETURN_VALUE = StackConfig.EMPTY_RETURN_VALUE;
	private static final int DEFAULT_VALUE = -1;

	private int total = DEFAULT_VALUE;

	private final int[] numbers;
	private final int stackSize;

	public IntArrayStack() {
		numbers = new int[DEFAULT_CAPACITY];
		this.stackSize = DEFAULT_CAPACITY;
	}

	public IntArrayStack(int stackSize) {
		numbers = new int[stackSize];
		this.stackSize = stackSize;
	}


	@Override
	public void push(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	@Override
	public boolean isEmpty() {
		return total == EMPTY_RETURN_VALUE;
	}

	@Override
	public boolean isFull() {
		return total == stackSize - 1;
	}

	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_RETURN_VALUE;
		return numbers[total];
	}

	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_RETURN_VALUE;
		return numbers[total--];
	}

	public int getTotal() {
		return total;
	}
}
