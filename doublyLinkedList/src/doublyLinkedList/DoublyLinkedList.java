package doublyLinkedList;


public class DoublyLinkedList {
	 Node head;
	 Node tail;
	private int size;
public DoublyLinkedList() {
	head=null;
	size=0;
}
public void insertAtBegining(int data){
	Node newNode=new Node(data);
	if(head==null) {
		head=newNode;
		tail=newNode;
	}else {
		newNode.next=head;
		head.previous=newNode;
		head=newNode;
	}
}


public void insertAtEnd(int data) {
	Node newNode=new Node(data);
	if(head==null) {
		head=newNode;
		tail=newNode;}
	else {
	    newNode.previous=tail;
	    tail.next=newNode;
	    tail=newNode;
	}
}


public void insertAtPosition(int data,int pos) {
	Node newNode=new Node(data);
	if(pos<=0) {
		insertAtBegining(data);
	}else {
		Node temp=head;
		int num=0;
		while(temp!=null&&num<pos)
		{
			temp=temp.next;
			num++;
		}
		 		if(temp!=null) {
		 		newNode.next=temp;
		 		newNode.previous=temp.previous;
		 		temp.previous=newNode;
		 		if(newNode.previous!=null) {
		 		newNode.previous.next=newNode;
         }
		else {
			head=newNode;
		}} 
		 
		 else {
			insertAtEnd(data);
		}}

	}


public void displayForward() {
Node current=head;
while(current!=null) {
	System.out.print(current.data+"<->");
	current=current.next;
	}
System.out.println("null");

}

public void displayBackward() {
	Node current=tail;
	while(current != null) {
		System.out.print(current.data+" ");
		current=current.previous;
	}
	
System.out.println("null");
}

public static void main(String ...string) {
	DoublyLinkedList list=new DoublyLinkedList();
	list.insertAtBegining(10);
	list.insertAtBegining(20);
	list.insertAtBegining(30);
	list.insertAtBegining(40);
	list.insertAtBegining(50);
	list.insertAtEnd(10);

	list.displayForward();
	list.displayBackward();
	list.insertAtPosition(1111, 3);
	list.displayForward();
	
}






}