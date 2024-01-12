package tester;
 
import customExceptions.*;
import customExceptions.IndexOutOfBoundsException;
import utils.CustomSinglyLinkedList;

public class Main {
	 public static void main(String[] args) {
	        java.util.Scanner scanner = new java.util.Scanner(System.in);
	        CustomSinglyLinkedList linkedList = new CustomSinglyLinkedList();

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Add element at the end");
	            System.out.println("2. Add element at index");
	            System.out.println("3. Remove all occurrences of an element");
	            System.out.println("4. Display all elements");
	            System.out.println("5. Reverse the linked list");
	            System.out.println("6. Check if the list is sorted");
	            System.out.println("7. Find the position of an element");
	            System.out.println("8. Exit");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            try {
	                switch (choice) {
	                    case 1:
	                        System.out.print("Enter the element to add at the end: ");
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
	                        linkedList.list();
	                        break;

	                    case 5:
	                        linkedList.reverse();
	                        break;

	                    case 6:
	                        System.out.println("Is the list sorted: " + linkedList.isSorted());
	                        break;

	                    case 7:
	                        System.out.print("Enter the element to find: ");
	                        int elementToFind = scanner.nextInt();
	                        int position = linkedList.find(elementToFind);
	                        if (position != -1) {
	                            System.out.println("Element found at position: " + position);
	                        } else {
	                            throw new ElementNotFoundException("Element not found in the list.");
	                        }
	                        break;

	                    case 8:
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
