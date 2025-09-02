package collectionframework.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class ListLinkdedListExample {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();

        // 1. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Banana"); // duplicates allowed

        // 2. Add at index
        fruits.add(1, "Mango");

        // 3. Get by index
        System.out.println("Element at index 2: " + fruits.get(2)); // Banana

        // 4. Remove by object
        fruits.remove("Banana"); // removes first occurrence

        // 5. Remove by index
        fruits.remove(0); // removes "Apple"

        // 6. Replace element at index
        fruits.set(1, "Orange"); // replace "Cherry" with "Orange"

        // 7. Contains
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // 8. Index of
        System.out.println("Index of Orange: " + fruits.indexOf("Orange"));

        // 9. Last index of
        System.out.println("Last index of Banana: " + fruits.lastIndexOf("Banana"));

        // 10. Size
        System.out.println("List size: " + fruits.size());

        // 11. Iterate
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 12. Clear
        fruits.clear();
        System.out.println("Is list empty? " + fruits.isEmpty());
    }
}
