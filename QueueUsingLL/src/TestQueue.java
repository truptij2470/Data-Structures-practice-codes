package tester;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Queue.QueueUsingLL;

public class TestQueue {

	public static void main(String[] args) {
		
		QueueUsingLL q = new QueueUsingLL();
		
		try(Scanner sc = new Scanner(System.in)){
			q.enqueue(4);
			q.enqueue(6);
			q.enqueue(10);
			q.enqueue(15);
			
			q.dequeue();
			q.dequeue();
			System.out.println(q.peak());
			
			q.display();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
