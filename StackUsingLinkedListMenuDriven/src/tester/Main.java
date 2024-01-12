package tester;
import utils.*;
import customexceptions.StackEmptyException;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter the element to push: ");
                        int element = scanner.nextInt();
                        stack.push(element);
                        break;

                    case 2:
                        int poppedElement = stack.pop();
                        System.out.println("Popped element: " + poppedElement);
                        break;

                    case 3:
                        int topElement = stack.peek();
                        System.out.println("Top element: " + topElement);
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
            } catch (StackEmptyException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}