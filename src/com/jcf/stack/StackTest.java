package com.jcf.stack;

public class StackTest<T> {

    private Node first = null;

    public static void main(String[] args) {

        StackTest<Integer> stack = new StackTest<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    protected boolean isEmpty() {
        return first == null;
    }

    protected void push(T item) {

        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    protected T pop() {

        T item = first.item;
        first = first.next;
        return item;
    }

    private class Node {
        T item;
        Node next;
    }
}
