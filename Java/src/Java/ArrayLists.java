package Java;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Printing the original ArrayList
        System.out.println("Original ArrayList:");
        System.out.println(fruits);

        
        // Accessing an element by index
        System.out.println("\nElement at index 2: " + fruits.get(2));

        
        // Modifying an element
        fruits.set(1, "Grapes");
        System.out.println("\nArrayList after modifying an element:");
        System.out.println(fruits);

        
        // Removing an element by value
        fruits.remove("Orange");
        System.out.println("\nArrayList after removing an element:");
        System.out.println(fruits);

        
        // Checking if an element exists
        String searchFruit = "Mango";
        if (fruits.contains(searchFruit)) {
            System.out.println("\n" + searchFruit + " is present in the ArrayList.");
        } else {
            System.out.println("\n" + searchFruit + " is not present in the ArrayList.");
        }

        
        // Sorting the ArrayList
        Collections.sort(fruits);
        System.out.println("\nArrayList after sorting:");
        System.out.println(fruits);

        
        // Reversing the ArrayList
        Collections.reverse(fruits);
        System.out.println("\nArrayList after reversing:");
        System.out.println(fruits);

        
        // Getting the size of the ArrayList
        int size = fruits.size();
        System.out.println("\nSize of the ArrayList: " + size);

        
        // Clearing the ArrayList
        fruits.clear();
        System.out.println("\nArrayList after clearing:");
        System.out.println(fruits);

        
        // Checking if the ArrayList is empty
        if (fruits.isEmpty()) {
            System.out.println("\nThe ArrayList is empty.");
        } else {
            System.out.println("\nThe ArrayList is not empty.");
        }
    }
}
