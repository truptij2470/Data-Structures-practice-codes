package queue;

import java.util.Scanner;

public class QueueTester {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in))
		{
			QueueImplementation queue = new QueueImplementation(6);
			boolean exit = true;
			
			while(exit)
			{
				
				System.out.println("\n\n1. Enqueue\n2. Dequeue\n3. Check queue is empty or not\n"
						+ "4. Check queue is full or not\n5. Front element of the queue"
						+ "\n6. Display\n7. Exit");
				
				try 
				{
					switch (sc.nextInt())
					{
					case 1:
						System.out.println("Enter element : ");
						queue.enqueue(sc.nextInt());	
						break;
					
					case 2:
						queue.dequeue();
						break;
						
					case 3:
						if(queue.isEmpty())
							System.out.println("Queue is empty");
						break;
						
					case 4:
						if(queue.isFull())
							System.out.println("Queue is full!");
						break;
						
					case 5:
						queue.peek();
						break;
						
					case 6:
						queue.display();
						break;
						
					case 7:
						exit = false;
						break;
						
					default:
						System.out.println("Invalid choice selection!");
						break;
					}
				
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			
		}
	}

}
	
}
