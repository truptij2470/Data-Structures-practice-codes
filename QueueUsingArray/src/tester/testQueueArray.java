package tester;

import QueueUsingArray.QueueUsingArray;

public class testQueueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int capacity = 10;
		QueueUsingArray qn = new QueueUsingArray(capacity);
		
		try {
			qn.enqueue(10);
			qn.enqueue(20);
			qn.enqueue(30);
			qn.enqueue(40);
			qn.dequeue();
			qn.dequeue();
			qn.display();
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}

}
