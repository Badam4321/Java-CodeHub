package collectionframework.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MaxPriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> maxPQ = new PriorityQueue<>((o1, o2) -> o2 - o1); // Comparator>

        // adding elements
        maxPQ.offer(10);
        maxPQ.offer(5);
        maxPQ.offer(15);

        // Maxpriority queue will be {15, 10, 5}
        System.out.println("Max Priority Queue: " + maxPQ);

        //peeking the head element
        System.out.println("Head element: " + maxPQ.peek());

        //polling the head element
        System.out.println("Removed element: " + maxPQ.poll());

        //It will be {10, 5}
        while(!maxPQ.isEmpty())
            System.out.println(maxPQ.poll());

        //checking if queue is empty
        System.out.println("Is queue empty? " + maxPQ.isEmpty());


    }
}
