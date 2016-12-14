package com.jcf.queue;

public class MyQueueImpl<T> implements MyQueue<T> {

    private Node first;
    private Node last;

    public static void main(String[] args) {

        MyQueue<String> queue = new MyQueueImpl<>();

        queue.offer("Monica");
        queue.offer("Rachel");
        queue.offer("Phoebe");
        queue.offer("Ross");
        queue.offer("Joey");
        queue.offer("Chandler");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }

    @Override
    public void offer(T item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else oldLast.next = last;
    }

    @Override
    public T poll() {
        T item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
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
