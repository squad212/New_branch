package com.trainning.sarita.basicproject.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


class StringLenghthCompartor implements Comparator<String>{

    @Override
    public int compare(String value1, String value2) {
        return Integer.compare(value1.length(), value2.length());

    }
}
public class QueueTest {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(new StringLenghthCompartor());
        queue.addAll(List.of("Zebra", "Monkey", "Cat"));

        //	poll() Retrieves and removes the head of this queue, or returns null if this queue is empty.
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());



    }
}
