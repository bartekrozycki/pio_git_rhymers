package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int SIZE = 12;
    private static final int IF_FULL = SIZE - 1;
    private static final int IS_EMPTY = -1;

    final private int[] numbers = new int[SIZE];

    private int total = IS_EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == IS_EMPTY;
    }

    public boolean isFull() {
        return total == IF_FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return IS_EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return IS_EMPTY;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
