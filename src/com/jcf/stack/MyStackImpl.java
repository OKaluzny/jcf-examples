package com.jcf.stack;

public class MyStackImpl<T> implements MyStack<T> {

    private Node first = null;

    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStackImpl<>();

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

        StackTest<String> stackSecond = new StackTest<>();

        stackSecond.push("Monica");
        stackSecond.push("Rachel");
        stackSecond.push("Phoebe");
        stackSecond.push("Ross");
        stackSecond.push("Joey");
        stackSecond.push("Chandler");

        System.out.println(stackSecond.pop());
        System.out.println(stackSecond.pop());
        System.out.println(stackSecond.pop());
        System.out.println(stackSecond.pop());
        System.out.println(stackSecond.pop());
        System.out.println(stackSecond.pop());
    }

    @Override
    public void push(T item) {

        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    @Override
    public T pop() {
        T item = first.item;
        first = first.next;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    private class Node {
        T item;
        Node next;
    }
}
