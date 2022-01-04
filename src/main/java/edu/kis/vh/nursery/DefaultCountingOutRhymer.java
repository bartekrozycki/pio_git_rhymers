package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int TWELVE = 12;
    private static final int ELEVEN = 11;
    private static final int NEGATIVE_ONE = -1;

    private int[] numbers = new int[TWELVE];

    private int total = NEGATIVE_ONE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NEGATIVE_ONE;
    }

    public boolean isFull() {
        return total == ELEVEN;
    }

    protected int peekaboo() {
        if (callCheck())
            return NEGATIVE_ONE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return NEGATIVE_ONE;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
