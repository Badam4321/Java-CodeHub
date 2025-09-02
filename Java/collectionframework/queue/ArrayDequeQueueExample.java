package collectionframework.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeQueueExample {
    public static void main(String[] args) {
        // Declare a Queue reference and instantiate with ArrayDeque
        Queue<Integer> taskQueue = new ArrayDeque<>();

        System.out.println("--- Using ArrayDeque as a Queue ---");

        // Adding elements to the queue (enqueue)
        taskQueue.offer(101); // Task ID 101
        taskQueue.offer(102); // Task ID 102
        taskQueue.offer(103); // Task ID 103
        System.out.println("Queue after adding: " + taskQueue); // [101, 102, 103]

        // Inspecting the head element (peek)
        Integer currentTask = taskQueue.peek();
        System.out.println("Current task (peek): " + currentTask); // 101
        System.out.println("Queue after peek: " + taskQueue);    // [101, 102, 103] (unchanged)

        // Removing elements from the queue (dequeue)
        Integer completedTask1 = taskQueue.poll();
        System.out.println("Completed task (poll): " + completedTask1); // 101
        System.out.println("Queue after first poll: " + taskQueue);   // [102, 103]

        Integer completedTask2 = taskQueue.remove();
        System.out.println("Completed task (remove): " + completedTask2); // 102
        System.out.println("Queue after second remove: " + taskQueue); // [103]

        // Checking if queue is empty
        System.out.println("Is queue empty? " + taskQueue.isEmpty()); // false

        taskQueue.poll(); // Remove 103
        System.out.println("Queue after final poll: " + taskQueue); // []
        System.out.println("Is queue empty? " + taskQueue.isEmpty()); // true

        // Attempting to add a null element (will throw NullPointerException)
        try {
            taskQueue.add(null);
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage() + " - ArrayDeque does not allow null elements.");
        }
    }
}
