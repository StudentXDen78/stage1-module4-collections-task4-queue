package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public static ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(firstQueue.remove());
        arrayDeque.add(firstQueue.remove());
        arrayDeque.add(secondQueue.remove());
        arrayDeque.add(secondQueue.remove());

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            firstQueue.add(arrayDeque.removeLast());
            arrayDeque.add(firstQueue.remove());
            arrayDeque.add(firstQueue.remove());

            secondQueue.offer(arrayDeque.removeLast());
            arrayDeque.add(secondQueue.remove());
            arrayDeque.add(secondQueue.remove());
        }

        return arrayDeque;
    }

    public static void main(String[] args) {
        Queue<Integer> firstQueue = new ArrayDeque<>(List.of(new Integer[]{1, 5, 7, 6}));
        Queue<Integer> secondQueue = new ArrayDeque<>(List.of(new Integer[]{2, 5, 8, 3}));
        createArrayDeque(firstQueue, secondQueue);
    }
}
