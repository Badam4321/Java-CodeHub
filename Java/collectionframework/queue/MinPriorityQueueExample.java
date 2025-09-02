package collectionframework.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MinPriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> minPQ = new PriorityQueue<>();

        // adding elements
        minPQ.offer(10);
        minPQ.offer(5);
        minPQ.offer(15);

        // Minpriority queue will be {5, 10, 15}
        System.out.println("Min Priority Queue: " + minPQ);

        //peeking the head element
        System.out.println("Head element: " + minPQ.peek());

        //polling the head element
        System.out.println("Removed element: " + minPQ.poll());

        //It will be {10, 15}
        while (!minPQ.isEmpty())
             System.out.println(minPQ.poll());

        //checking if queue is empty
        System.out.println("Is queue empty? " + minPQ.isEmpty());


    }
}
