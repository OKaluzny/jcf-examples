package com.jcf.queue;

interface MyQueue<T> {

    void offer(T item);

    T poll();

    public boolean isEmpty();

}
