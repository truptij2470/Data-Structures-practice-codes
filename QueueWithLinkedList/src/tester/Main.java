package tester;

import CustomExceptions.QueueEmptyException;
import utils.*;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Queue queue = new Queue();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter the element to enqueue: ");
                        int element = scanner.nextInt();
                        queue.enqueue(element);
                        break;

                    case 2:
                        int dequeuedElement = queue.dequeue();
                        System.out.println("Dequeued element: " + dequeuedElement);
                        break;

                    case 3:
                        queue.display();
                        break;

                    case 4:
                        System.out.println("Exiting the program.");
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            } catch (QueueEmptyException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}