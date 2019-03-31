package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.IntStackInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private IntLinkedList temp = new IntLinkedList();

    public FIFORhymer(IntStackInterface intStackInterface) {
        super(intStackInterface);
    }

    public FIFORhymer() {
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
