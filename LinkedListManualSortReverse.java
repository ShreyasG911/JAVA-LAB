// Practical: Program to Sort and Reverse LinkedList Elements without Collections.sort() or reverse()

import java.util.*;

public class LinkedListManualSortReverse {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        // Input elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("\nOriginal LinkedList: " + list);

        // ---------- Sorting manually (Bubble Sort) ----------
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Swap elements
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sorted LinkedList (Ascending): " + list);

        // ---------- Reversing manually ----------
        int left = 0, right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
        System.out.println("Reversed LinkedList (Descending): " + list);

        sc.close();
    }
}
