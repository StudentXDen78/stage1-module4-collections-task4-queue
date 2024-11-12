package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public static List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> dishOrder = new ArrayList<>();
        ArrayDeque<Integer> numericDishes  = new ArrayDeque<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            numericDishes.add(i);
        }

        while (!numericDishes.isEmpty()) {
            int count = everyDishNumberToEat;
            while (count - 1> 0) {
                numericDishes.addLast(numericDishes.removeFirst());
                count--;
            }
            dishOrder.add(numericDishes.removeFirst());
        }

        return dishOrder;
    }

    public static void main(String[] args) {
        determineDishOrder(10, 3);
    }
}