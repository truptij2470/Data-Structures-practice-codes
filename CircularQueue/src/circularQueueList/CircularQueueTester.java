package circularQueueList;

import java.util.Scanner;


public class CircularQueueTester {
	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in))
		{
			CircularQueue obj = new CircularQueue(6);
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
						obj.enqueue(sc.nextInt());	
						break;
					
					case 2:
						obj.dequeue();
						break;
						
					case 3:
						if(obj.isEmpty())
							System.out.println("Queue is empty");
						break;
						
					case 4:
						if(obj.isFull())
							System.out.println("Queue is full!");
						break;
						
					
						
					case 6:
						obj.display();
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
