package stack;

import static stack.StackImplementation.*;

import java.util.Scanner;

public class StackTester {

	public static void main(String[] args) {

		StackImplementation obj = new StackImplementation(10);
		boolean exit = true;
		try (Scanner scanner = new Scanner(System.in)) {
			while (exit) {

				System.out.println("\n\n-----------------------------STACK------------------------\n\n");
				System.out.println("1. push\n2. pop\n3. check if empty is empty\n4. checck if stack is full"
						+ "\n5. peek \n6. display()\n7. exit");
				try {
						switch (scanner.nextInt()) 
					{

					case 1:
						System.out.println("enter the element : ");
						int temp = scanner.nextInt();
						obj.push(temp);
						break;
						
					case 2:
						obj.pop();
						break;
						
					case 3:
						if (isEmpty())
						{
							System.out.println("Stack is empty...");
						} 
						else 
						{
							System.out.println("stck is not empty...");
						}
						break;
						
					case 4:
						if (obj.isFull())
							System.out.println("stack is full.............");
						else 
						{
							System.out.println("stack is empty...");
						}
						break;
						
					case 5:
						System.out.println("top of stack element : " + obj.peek());
						break;
						
					case 6:
						obj.display();
						
					case 7:
						exit = false;
						break;
						
					default:
						System.out.println("incorrect choice.....");
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		/*
		 * try {StackImplementation obj = new StackImplementation(10);
		 * System.out.println(StackImplementation.isEmpty());
		 * System.out.println(StackImplementation.isFull()); obj.push(11); obj.push(12);
		 * 
		 * obj.push(13);
		 * 
		 * obj.push(14);
		 * 
		 * obj.push(15); obj.push(16); obj.push(17); obj.push(18); obj.push(19);
		 * obj.push(20); obj.push(21); obj.pop();
		 * 
		 * 
		 * 
		 * }catch(StackOverflowError e) {e.printStackTrace();}
		 */

	}

}
