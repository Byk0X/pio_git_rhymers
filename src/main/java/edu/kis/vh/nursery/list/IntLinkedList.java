package edu.kis.vh.nursery.list;

import com.sun.tools.javac.comp.Todo;

public class IntLinkedList {

    private static final int IF_EMPTY = -1;
    private Node last;
    private int i;
    //TODO usnięcie nieużywanego i

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    //TODO metoda zawsze zwraca false
    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return IF_EMPTY;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return IF_EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }
    private class Node {

        private final int value;
        private Node prev;
        private Node next;

        public Node(int i) {
            value = i;
        }

        public int getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
