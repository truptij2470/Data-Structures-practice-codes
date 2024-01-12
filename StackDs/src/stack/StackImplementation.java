package stack;
import stack.StackCustomException;

public class StackImplementation {
private static int arr[];
private static int top;

public StackImplementation(int size) {
	arr = new int[size];
	top = -1;

}

public static boolean isEmpty(){
	if(top==-1)
		return true;
	
	return false;
}

public static boolean isFull() {
	if(top==arr.length-1)
		return true;
	return false;
}

public static void push(int element) 
{
	if(isFull()) {
		System.err.println("stack is full......!");	
	return;}
	arr[++top]=element;
	System.out.println("element is pushed....!");
	
}

public static void  pop()throws StackCustomException {
	if(isEmpty()) {
throw new StackCustomException("stack is empty........");
      }
	
	System.out.println((arr[top--])+" "+"is popped....!");
	
}


public static int peek()throws StackCustomException {
	if(isEmpty())
	throw new StackCustomException("stack is empty........");

	return arr[top];
	
}


public void display()
{
	for(int i=0;i<arr.length-1;i++)
	{
		if(arr[i]>0)
			System.out.print(arr[i]+" ");
	}
}


	

}
