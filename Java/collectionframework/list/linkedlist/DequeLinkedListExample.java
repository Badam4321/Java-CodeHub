package collectionframework.list.linkedlist;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeLinkedListExample {
    public static void main(String[] args) {

        // 1. Declaring a Deque and instantiating it with a LinkedList
        // This is the most common and recommended way to use Deque with LinkedList
        Deque<String> messageQueue = new LinkedList<>();

        System.out.println("--- Deque Operations using LinkedList ---");

        // Adding elements to the front (head) of the deque
        messageQueue.addFirst("Welcome");
        System.out.println("After addFirst(\"Welcome\"): " + messageQueue);

        messageQueue.offerFirst("Hello"); // offerFirst is similar to addFirst, but returns false if insertion fails
        System.out.println("After offerFirst(\"Hello\"): " + messageQueue);

        // Adding elements to the back (tail) of the deque
        messageQueue.addLast("World");
        System.out.println("After addLast(\"World\"): " + messageQueue);

        messageQueue.offerLast("!"); // offerLast is similar to addLast, but returns false if insertion fails
        System.out.println("After offerLast(\"!\"): " + messageQueue);

        // Peeking at elements (retrieving without removing)
        String firstElement = messageQueue.peekFirst(); // Returns null if deque is empty
        System.out.println("Peek First: " + firstElement);

        String lastElement = messageQueue.peekLast(); // Returns null if deque is empty
        System.out.println("Peek Last: " + lastElement);

        // Removing elements from the front (head)
        String removedFirst = messageQueue.removeFirst(); // Throws NoSuchElementException if deque is empty
        System.out.println("Removed First: " + removedFirst);
        System.out.println("Deque after removeFirst: " + messageQueue);

        String polledFirst = messageQueue.pollFirst(); // Returns null if deque is empty
        System.out.println("Polled First: " + polledFirst);
        System.out.println("Deque after pollFirst: " + messageQueue);

        // Removing elements from the back (tail)
        String removedLast = messageQueue.removeLast(); // Throws NoSuchElementException if deque is empty
        System.out.println("Removed Last: " + removedLast);
        System.out.println("Deque after removeLast: " + messageQueue);

        String polledLast = messageQueue.pollLast(); // Returns null if deque is empty
        System.out.println("Polled Last: " + polledLast);
        System.out.println("Deque after pollLast: " + messageQueue);

        System.out.println("\n--- Initializing with multiple elements ---");
        messageQueue.add("Element A"); // add() uses addLast() internally
        messageQueue.addFirst("Element B");
        messageQueue.addLast("Element C");
        messageQueue.add("Element D");

        System.out.println("Current Deque: " + messageQueue);

        // Iterating through the Deque
        System.out.println("Iterating through the Deque:");
        Iterator<String> iterator = messageQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        // Checking size
        System.out.println("Deque size: " + messageQueue.size());

        // Clearing the deque
        messageQueue.clear();
        System.out.println("Deque after clear(): " + messageQueue);
        System.out.println("Is Deque empty? " + messageQueue.isEmpty());

        System.out.println("--- Deque as a Stack (LIFO) ---");
        Deque<Integer> stack = new LinkedList<>();
        stack.push(10); // Adds element to the top (front)
        stack.push(20);
        stack.push(30);
        System.out.println("Stack (Deque): " + stack);
        System.out.println("Popped from stack: " + stack.pop()); // Removes element from the top (front)
        System.out.println("Stack after pop: " + stack);

        System.out.println("--- Deque as a Queue (FIFO) ---");
        Deque<Character> queue = new LinkedList<>();
        queue.offer('X'); // Adds element to the tail
        queue.offer('Y');
        queue.offer('Z');
        System.out.println("Queue (Deque): " + queue);
        System.out.println("Polled from queue: " + queue.poll()); // Removes element from the head
        System.out.println("Queue after poll: " + queue);
    }
}
