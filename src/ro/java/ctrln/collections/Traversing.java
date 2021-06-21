package ro.java.ctrln.collections;

import java.util.*;

public class Traversing {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("First", "Second", "Third"));

        System.out.print("Elementele listei: ");
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println();

        SortedSet<Integer> set = new TreeSet<>(Arrays.asList(1, 4, 5, 2, 6));
        System.out.print("Elementele setului: ");
        for (Integer element : set) {
            System.out.print(element + " ");
        }
        System.out.println();

        Queue<String> queue = new LinkedList<>();
        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");
        queue.offer("Four");
        System.out.print("Elementele cozii: ");
        for (String element : queue) {
            System.out.print(element + " ");
        }
        System.out.println();

        Deque<String> deque = new LinkedList<>();
        deque.addFirst("One1");
        deque.addLast("Last1");
        deque.addFirst("One2");
        deque.addLast("Last2");
        deque.add("Two");
        deque.add("Three");
        System.out.println("Elementele deque: ");
        for (String element : deque) {
            System.out.print(element + " ");
        }
        System.out.println();

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "First Element");
        hashMap.put(2, "Second Element");
        hashMap.put(3, "Third Element");
        hashMap.put(4, "First Element");
        hashMap.put(null,"Null Element");
        System.out.println("Entry-urile din hashmap: ");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}