package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public static PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String> list = new ArrayList<>();
        list.addAll(firstList);
        list.addAll(secondList);
        Collections.sort(list);
        Collections.reverse(list);
        return new PriorityQueue<>(list);
    }

    public static void main(String[] args) {
        createPriorityQueue(new ArrayList<>(List.of("Java", "PriorityQueue", "class")), new ArrayList<>(List.of("It", "is", "different", "from", "standard", "queues", "where", "FIFO")));
    }
}
