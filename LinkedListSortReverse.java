// Practical: Program to Sort and Reverse LinkedList Elements

import java.util.*;

public class LinkedListSortReverse {
    public static void main(String[] args) {
        // Create LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        // Input elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Original list
        System.out.println("\nOriginal LinkedList: " + list);

        // Sort in ascending order
        Collections.sort(list);
        System.out.println("Sorted LinkedList (Ascending): " + list);

        // Reverse (Descending order)
        Collections.reverse(list);
        System.out.println("Reversed LinkedList (Descending): " + list);

        sc.close();
    }
}
