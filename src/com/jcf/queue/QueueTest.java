package com.queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);

        while (!queue.isEmpty()) {
            queue.poll();
            System.out.println(queue);
            /*FIFO
            [4, 3, 2, 1]
            [3, 2, 1]
            [2, 1]
            [1]
            []*/
        }

        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(5);
        priorityQueue.add(4);
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(1);

        while (!priorityQueue.isEmpty()) {
            priorityQueue.poll();
            System.out.println(priorityQueue);
            /*LIFO
            [2, 3, 4, 5]
            [3, 5, 4]
            [4, 5]
            [5]
            []*/
        }

        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if (o2 % 2 == 0) {
                    return 1;
                }
                if (o1 % 2 == 0) {
                    return -1;
                }
                return 0;
            }
        };

        Queue<Integer> priorityQueuePro = new PriorityQueue<>(10, comparator);

        priorityQueuePro.offer(5);
        priorityQueuePro.offer(2);
        priorityQueuePro.offer(1);
        priorityQueuePro.offer(4);

        while (!priorityQueuePro.isEmpty()) {
            System.out.println(priorityQueuePro.poll()); // 2 4 1 5
        }
        System.out.println(priorityQueuePro.hashCode());
    }
}
