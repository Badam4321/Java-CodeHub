package collectionframework.list.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class ReverseElements {
    public static void main(String[] args) {
        List<Integer> arrList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Deque<Integer> deque = new ArrayDeque<>(arrList);
        deque.descendingIterator().forEachRemaining(System.out::println);
    }
}
