package collectionframework.list.stack;

import java.util.Stack;
import java.util.EmptyStackException;

public class OldSchoolStackExample {

    public static void main(String[] args) {
        // Create a Stack of Strings
        Stack<String> bookStack = new Stack<>();

        System.out.println("--- Using java.util.Stack ---");

        // 1. Push elements onto the stack (add to the top)
        bookStack.push("The Hitchhiker's Guide to the Galaxy");
        bookStack.push("The Lord of the Rings");
        bookStack.push("Brave New World");
        System.out.println("Stack after pushes: " + bookStack); // Output shows elements in insertion order (bottom to top)

        // 2. Peek at the top element (without removing it)
        try {
            String topBook = bookStack.peek();
            System.out.println("Top element (peek): " + topBook);
            System.out.println("Stack after peek: " + bookStack); // Stack remains unchanged
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty, cannot peek.");
        }

        // 3. Pop elements from the stack (remove from the top)
        try {
            String poppedBook1 = bookStack.pop();
            System.out.println("Popped element: " + poppedBook1);
            System.out.println("Stack after first pop: " + bookStack);

            String poppedBook2 = bookStack.pop();
            System.out.println("Popped element: " + poppedBook2);
            System.out.println("Stack after second pop: " + bookStack);
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty, cannot pop.");
        }

        // 4. Check if the stack is empty
        System.out.println("Is stack empty? " + bookStack.empty());

        bookStack.pop(); // Pop the last remaining element
        System.out.println("Stack after final pop: " + bookStack);
        System.out.println("Is stack empty? " + bookStack.empty());

        // Trying to pop from an empty stack will throw EmptyStackException
        try {
            bookStack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Caught exception: " + e.getMessage() + " - Cannot pop from an empty stack.");
        }

        // 5. Search for an element (returns 1-based position from the top)
        bookStack.push("Dune");
        bookStack.push("Neuromancer");
        System.out.println("Stack for search: " + bookStack);
        int position = bookStack.search("Dune"); // "Neuromancer" is at position 1, "Dune" is at position 2
        System.out.println("Position of 'Dune': " + position); // Output: 2

        int notFoundPosition = bookStack.search("Foundation");
        System.out.println("Position of 'Foundation': " + notFoundPosition); // Output: -1 (not found)
    }
}
