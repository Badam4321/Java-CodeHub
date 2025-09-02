package collectionframework.list;

import java.util.*;

public class ListTraversal {
    public static void main(String[] args) {// ✅ Use ArrayList to allow modifications

        List<Integer> arrList = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        ListIterator<Integer> listIterator = arrList.listIterator();

        // 🔹 Forward Traversal
        System.out.println("Forward Traversal:");
        while (listIterator.hasNext()) {
            System.out.println("Index: " + listIterator.nextIndex() + " → " + listIterator.next());
        }

        // 🔹 Backward Traversal
        System.out.println("\nBackward Traversal:");
        while (listIterator.hasPrevious()) {
            System.out.println("Index: " + listIterator.previousIndex() + " → " + listIterator.previous());
        }

        // 🔹 Modifying the List using ListIterator
        listIterator = arrList.listIterator();
        while (listIterator.hasNext()) {
            int val = listIterator.next();
            if (val == 20) {
                listIterator.set(25);  // ✅ Replaces 20 with 25
            }
            if (val == 10) {
                listIterator.add(5);   // ✅ Adds 5 after 10
            }
        }

        System.out.println("\nModified List: " + arrList);
    }
}
