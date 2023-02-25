package org.OOP.Collection.LinkedList;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        System.out.println(list.get(5));

        list.addFirst(99);
        list.addFirst(98);
        list.addLast(55);
        System.out.println(list);


        System.out.println("-------------------");
        int tempValue = list.poll();
        System.out.println("pol " + tempValue);
        System.out.println(list);

        System.out.println("-------------------");
        int nextValue = list.pop();
        System.out.println("pop " + nextValue);
        System.out.println(list);
    }
}
