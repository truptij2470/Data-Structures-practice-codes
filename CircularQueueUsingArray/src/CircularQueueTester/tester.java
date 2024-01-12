package CircularQueueTester;

import CircularQueue.CircularQueueUsingArr;

public class tester {

	public static void main(String[] args) {
		CircularQueueUsingArr cn = new CircularQueueUsingArr();
		
		try {
			cn.enqueue(20);
			cn.enqueue(30);
			cn.enqueue(40);
			cn.enqueue(10);
			
			cn.display();
			
			cn.dequeue();
			cn.dequeue();
			cn.display();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
