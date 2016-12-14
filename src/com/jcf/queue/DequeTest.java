package com.jcf.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {

    public static void main(String[] args) {

        Deque<Integer> stackProbe = new ArrayDeque<>(); // LIFO

        stackProbe.push(5);
        stackProbe.push(4);
        stackProbe.push(3);
        stackProbe.push(2);
        stackProbe.push(1);

        System.out.println(stackProbe);
        System.out.println(stackProbe.pop());
        System.out.println(stackProbe.pop());
        System.out.println(stackProbe.pop());
        System.out.println(stackProbe.pop());
        System.out.println(stackProbe.pop());
    }
}
