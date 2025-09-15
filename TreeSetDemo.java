// Practical No. 1: Program to Insert, Retrieve and Remove Records using TreeSet

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> records = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- TreeSet Operations ---");
            System.out.println("1. Insert Record");
            System.out.println("2. Retrieve Records");
            System.out.println("3. Remove Record");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter record to insert: ");
                    String insertRecord = sc.nextLine();
                    if (records.add(insertRecord)) {
                        System.out.println("✅ Record inserted.");
                    } else {
                        System.out.println("⚠️ Record already exists.");
                    }
                    break;

                case 2:
                    System.out.println("\nRecords in TreeSet:");
                    if (records.isEmpty()) {
                        System.out.println("No records available.");
                    } else {
                        for (String record : records) {
                            System.out.println(record);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter record to remove: ");
                    String removeRecord = sc.nextLine();
                    if (records.remove(removeRecord)) {
                        System.out.println("✅ Record removed.");
                    } else {
                        System.out.println("⚠️ Record not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
