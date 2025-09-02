package collectionframework.list.linkedlist;

import java.util.*;

public class QueueLinkedListExample {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();

        // 1. offer() → add to rear
        numbers.offer(10);
        numbers.offer(20);
        numbers.offer(30);

        // 2. add() → same as offer() but throws exception if capacity full
        numbers.add(40);

        // 3. peek() → get head without removing
        System.out.println("Front element: " + numbers.peek()); // 10

        // 4. element() → same as peek() but throws exception if empty
        System.out.println("Front (element): " + numbers.element());

        // 5. poll() → remove head
        System.out.println("Removed: " + numbers.poll()); // 10

        // 6. remove() → same as poll() but throws exception if empty
        System.out.println("Removed (remove): " + numbers.remove()); // 20

        // 7. Remaining elements
        System.out.println("Remaining:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 8. Clear queue
        numbers.clear();
        System.out.println("Queue is empty? " + numbers.isEmpty());
    }
}

