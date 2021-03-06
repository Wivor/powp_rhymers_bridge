package edu.kis.vh.nursery.stack;

public class IntLinkedList implements IntStackInterface {

	Node last;

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
			return EMPTY_STACK_INDEX;
		return last.getValue();
	}

	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_INDEX;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
