package edu.kis.vh.nursery.list;

/**
 * Simple node class with value and connections to prev and next
 *
 * Used by {@link IntLinkedList}
 */
class Node {

    final private int value;
    private Node prev, next;

    public Node(int i) {
        value = i;
    }

    /**
     * Value of node
     *
     * @return {@link int}
     */
    public int getValue() {
        return value;
    }

    /**
     * Get prev node
     *
     * @return {@link Node}
     */
    public Node getPrev() {
        return prev;
    }

    /**
     * Get next node
     *
     * @return {@link Node}
     */
    public Node getNext() {
        return next;
    }

    /**
     * Set prev node
     *
     * @param prev {@link Node}
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     * Set next node
     *
     * @param next {@link Node}
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
