package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public static PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.addAll(firstList);
        priorityQueue.addAll(secondList);
        // Collections.reverse(List.of(priorityQueue));
        /*List<String> list = new ArrayList<>();
        list.addAll(firstList);
        list.addAll(secondList);
        Collections.sort(list);
        Collections.reverse(list);
        */
        return priorityQueue;
    }

    public static void main(String[] args) {
        createPriorityQueue(new ArrayList<>(List.of("Java", "PriorityQueue", "class")), new ArrayList<>(List.of("It", "is", "different", "from", "standard", "queues", "where", "FIFO")));
    }
}
