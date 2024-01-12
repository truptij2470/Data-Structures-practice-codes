package tester;

import CustomExceptions.ElementNotFoundException;
import utils.CircularLinkedList;

public class Main {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        CircularLinkedList linkedList = new CircularLinkedList();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add element");
            System.out.println("2. Add element at index");
            System.out.println("3. Remove element");
            System.out.println("4. Display all elements");
            System.out.println("5. Check if the list is sorted");
            System.out.println("6. Find the position of an element");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter the element to add: ");
                        int elementToAdd = scanner.nextInt();
                        linkedList.add(elementToAdd);
                        break;

                    case 2:
                        System.out.print("Enter the element to add: ");
                        int elementToAddAtIndex = scanner.nextInt();
                        System.out.print("Enter the index: ");
                        int indexToAdd = scanner.nextInt();
                        linkedList.add(elementToAddAtIndex, indexToAdd);
                        break;

                    case 3:
                        System.out.print("Enter the element to remove: ");
                        int elementToRemove = scanner.nextInt();
                        linkedList.remove(elementToRemove);
                        break;

                    case 4:
                        linkedList.display();
                        break;

                    case 5:
                        System.out.println("Is the list sorted: " + linkedList.isSorted());
                        break;

                    case 6:
                        System.out.print("Enter the element to find: ");
                        int elementToFind = scanner.nextInt();
                        int position = linkedList.find(elementToFind);
                        if (position != -1) {
                            System.out.println("Element found at position: " + position);
                        } else {
                            throw new ElementNotFoundException("Element not found in the list.");
                        }
                        break;

                    case 7:
                        System.out.println("Exiting the program.");
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            } catch (ElementNotFoundException | IndexOutOfBoundsException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

}
