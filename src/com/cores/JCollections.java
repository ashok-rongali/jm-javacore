package com.cores;

import java.util.*;

public class JCollections {

    public static void jmCollection(){
        //List Interface
        Collection<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println(""+fruits);

        List<String> fruitsList = new ArrayList<>();

        Collection<String> items = new HashSet<>(); // Valid — Set is a Collection
        // Collection<String> map = new HashMap<>(); // ❌ Compilation Error


    }

    public static void jmArraylist(){
        ArrayList<String> list = new ArrayList<>();
        list.ensureCapacity(100); // ✅ Allowed , only in ArrayList not List

        List<String> fruits = new ArrayList<>();
        // 1. Add Elements
        fruits.add("Apple");                           // Add at end
        fruits.add(1, "Banana");         // Insert at specific index
        fruits.addAll(List.of("Mango", "Orange"));     // Add all elements from another collection
        fruits.addAll(2, List.of("Kiwi", "Grapes"));   // Insert at specific index

        // 2. Access/Read Elements
        String first = fruits.get(0);                  // Get element by index
        int count = fruits.size();                     // Number of elements
        boolean empty = fruits.isEmpty();              // Is list empty?

        // 3. Modify/Update Elements
        fruits.set(0, "Pineapple");                    // Replace element at index 0

        // 4. Remove Elements
        fruits.remove("Banana");                       // Remove by value
        fruits.remove(1);                              // Remove by index
        fruits.removeAll(List.of("Mango", "Kiwi"));    // Remove all matching elements
        // fruits.clear();                             // Remove all elements

        // 5. Search
        boolean hasApple = fruits.contains("Apple");   // true/false
        int firstIndex = fruits.indexOf("Apple");      // Index of first occurrence
        int lastIndex = fruits.lastIndexOf("Apple");   // Index of last occurrence

        // 6. Loop / Traverse
        for (String fruit : fruits) {
            System.out.println(fruit);                 // Enhanced for-loop
        }

        Iterator<String> it = fruits.iterator();       // Basic iterator
        while (it.hasNext()) {
            System.out.println(it.next());
//            System.out.println(it.prevous());//Error
        }

        ListIterator<String> listIt = fruits.listIterator(); // Bi-directional traversal
        while (listIt.hasNext()) {
            System.out.println(listIt.next());
            System.out.println(listIt.previous());
        }

        // 7. Sublist
        List<String> sub = fruits.subList(0, Math.min(2, fruits.size())); // Safe sublist

        // 8. Convert to Array
        Object[] objArr = fruits.toArray();            // To Object array
        String[] strArr = fruits.toArray(new String[0]); // To typed array

        // 9. Bulk Operations
        fruits.containsAll(List.of("Apple", "Kiwi"));      // true/false
        fruits.retainAll(List.of("Apple", "Mango"));       // Retain only these
        fruits.removeAll(List.of("Orange", "Pineapple"));  // Remove all these

        // 10. Sort, Reverse, Shuffle (Collections class)
        Collections.sort(fruits);                      // Sort alphabetically
        Collections.reverse(fruits);                   // Reverse the list
        Collections.shuffle(fruits);                   // Random order

    }

    public static void jmLinkedList() {
        LinkedList<String> list = new LinkedList<>();

        // 1. Add Elements
        list.add("Banana");                          // Add at end
        list.addFirst("Apple");                   // Add at beginning
        list.addLast("Cherry");                   // Add at end
        list.add(1, "Kiwi");           // Insert at index 1

        // 2. Access Elements
        String first = list.getFirst();              // Get first element
        String last = list.getLast();                // Get last element
        String atIndex = list.get(2);                // Get element by index

        // 3. Update Element
        list.set(2, "Mango");                        // Replace element at index 2

        // 4. Remove Elements
        list.remove("Apple");                        // Remove by value
        list.removeFirst();                          // Remove first
        list.removeLast();                           // Remove last
        list.remove(0);                              // Remove by index

        // 5. Queue-style Operations
        list.offer("Watermelon");                    // Add to end
        list.offerFirst("Orange");                   // Add to front
        list.offerLast("Papaya");                    // Add to end
        String head = list.peek();                   // View first
        String polled = list.poll();                 // Remove and return first

        // 6. Loop / Traverse
        System.out.println("Current List:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }


    public static void main(String[] args) {
        JCollections.jmCollection();
    }
}
