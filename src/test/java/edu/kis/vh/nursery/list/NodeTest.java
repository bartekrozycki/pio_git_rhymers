package edu.kis.vh.nursery.list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class NodeTest {

	private static final int VALUE = 123456;
	private Node node;

	@Before
	public void setUp() throws Exception {
		node = new Node(VALUE);

		assertNull(node.getNext());
        assertNull(node.getPrev());
	}

	@Test
	public void testGetValue() {
		assertEquals(VALUE, node.getValue());
	}

	@Test
	public void testGetPrev() {
		assertNull(node.getPrev());
	}

	@Test
	public void testGetNext() {
		assertNull(node.getNext());
	}

	@Test
	public void testSetPrev() {
		final Node prev = new Node(1);
		node.setPrev(prev);
		assertEquals(prev, node.getPrev());
	}

	@Test
	public void testSetNext() {
		final Node prev = new Node(1);
		node.setNext(prev);
		assertEquals(prev, node.getNext());
	}
}
