package collectionframework.list.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ModernStackExample {
    public static void main(String[] args) {
        // Using ArrayDeque as a Stack
        Deque<Integer> numberStack = new ArrayDeque<>(); // Using Deque interface>

        // Push elements onto the stack
        //push(element) equivalent to offerFirst(element)
        numberStack.push(1);
        numberStack.push(2);
        numberStack.push(3);
        numberStack.push(4);

        System.out.println("Stack after pushing elements: " + numberStack);

        // Peek at the top element
        int topNumber = numberStack.peek();
        System.out.println("Top element (peek): " + topNumber);
        System.out.println("Stack after peek: " + numberStack);

        // Pop elements from the stack
        int poppedNumber1 = numberStack.pop();
        System.out.println("Popped element: " + poppedNumber1);
        System.out.println("Stack after first pop: " + numberStack);

        int poppedNumber2 = numberStack.pop();
        System.out.println("Popped element: " + poppedNumber2);
        System.out.println("Stack after second pop: " + numberStack);

        //clear the stack
        numberStack.clear();
        System.out.println("Stack after clear: " + numberStack);

        // Check if the stack is empty
        boolean isEmpty = numberStack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);
    }
}

/*
In Java, a "Stack" is a linear data structure that follows the Last-In, First-Out (LIFO) principle. Imagine a stack of plates: you can only add a new plate to the top, and you can only remove the top plate.

Java provides a Stack class in java.util, but it's generally recommended to use java.util.Deque (specifically ArrayDeque or LinkedList) as a stack instead. The reasons for this recommendation are:

Legacy Class: The java.util.Stack class is a legacy class that extends java.util.Vector. Vector is synchronized, meaning it's thread-safe, which adds overhead even in single-threaded scenarios where it's not needed. Its design is considered suboptimal in modern Java.
More Flexible and Modern: Deque (Double-Ended Queue) is an interface introduced in Java 6 as part of the Java Collections Framework. It provides a more complete and consistent set of LIFO (stack) and FIFO (queue) operations.
Better Performance: ArrayDeque (a common Deque implementation) is generally faster than Stack for stack operations because it's not synchronized by default, and it uses a resizable array for efficient memory usage.
*/
