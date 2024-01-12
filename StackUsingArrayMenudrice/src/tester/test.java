package tester;

import java.util.Scanner;

import CustomExceptions.*;
import utils.*;

public class test {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the stack: ");
        int capacity = scanner.nextInt();
        Stack stack = new Stack(capacity);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = scanner.nextInt();
                    try {
                        stack.push(element);
                    } catch (StackOverflowException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        stack.pop();
                    } catch (StackUnderflowException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        int topElement = stack.peek();
                        System.out.println("Top element: " + topElement);
                    } catch (StackUnderflowException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
