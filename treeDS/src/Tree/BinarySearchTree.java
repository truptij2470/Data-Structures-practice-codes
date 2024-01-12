package Tree;

import java.util.Scanner;
import java.util.Stack;

public class BinarySearchTree {
Node root;
BinarySearchTree(){
	root=null;
}
void insert(int value) {
	Node newNode=new Node(value);
if(root==null) {
	root=newNode;
}else insert(root,newNode);
}

void insert(Node node,Node newNode) {
	if(newNode.value<node.value) {
	  if(node.left==null) 
		{
		node.left=newNode;
		}else
		{
		insert(node.left,newNode);
		}
	
	}else {
		if(node.right==null)
		{
			node.right=newNode;
		}else 
		{
				insert(node.right,newNode);
		}
		
	}
}
public void preOrder() {
	preOrder(root);
}
public void preOrder(Node root) 
{
	if(root==null) {
		return;
	}
	else {
		{
			System.out.print(root.value+" ");
			preOrder(root.left);
			preOrder(root.right);

		}
	}
}

public void inorder() {
	inOrder(root);
}

public void inOrder(Node root)
{
	if(root==null)
	{
		return;
	}
	else {
	{			

		inOrder(root.left);
		System.out.print(root.value+" ");
		inOrder(root.right);

	}
	}
	}
public void postOrder() {
	postOrder(root);
}

public void postOrder(Node root)
{
	if(root==null)
	{
		return;
	}else 
	{
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.value+" ");
	}
}
public void preOrderIterative()
{
	preOrderIterative(root);
	}
public void preOrderIterative(Node root)
{
	if(root==null) {
		return;
	}
	Stack<Node>stack=new Stack<>();
	stack.push(root);
	while(!stack.isEmpty()) {
	Node current=stack.pop();
	System.out.print(current.value+" ");
	if(current.right!=null) 
	{
		stack.push(current.right);
	}
	if(current.left!=null)
	{
	stack.push(current.left);
	}
}
}

public void postOrderIterative()
{
	postOrderIterative(root);
	}

public void postOrderIterative(Node root)
{
	if(root==null) {
		return;
	}
	Stack<Node>stack=new Stack<>();
	stack.push(root);
	while(!stack.isEmpty()) {
	Node current=stack.pop();
	System.out.print(current.value+" ");
	if(current.left!=null)
	{
	stack.push(current.left);
	}
	if(current.right!=null) 
	{
		stack.push(current.right);
	}
}
}


public void inorderIterative() {
	Stack<Node>stack=new Stack<>();
    Node current=root;
    while(current!=null || !stack.isEmpty())
    {
    	while(current!=null) {
    		stack.push(current);
    		current=current.left;
    	}
    	current=stack.pop();  
    	System.out.print(current.value+" ");
    	current=current.right;
    }
}


public void postOrderIteravtive() {
	if(root==null)
	{
	return;
	}
	Stack<Node>stack1=new Stack<>();
	Stack<Node>stack2=new Stack<>();
	stack1.push(root);
	
	while(!stack1.isEmpty())
	{
		Node current = stack1.pop();
		stack2.push(current);
		if(current.left!=null)
		{
			stack1.push(current.left);
		}
		if(current.right!=null) {
			stack1.push(current.right);
		}
	}
	while(!stack2.isEmpty())
	{
		Node current = stack2.pop();
		System.out.print(current.value+" ");
	}

}

public void leafNodes() {
	leafNodes(this.root);
}
public void leafNodes(Node root) {
	if(root==null) 
	{
		return;
	}
	
	leafNodes(root.left);
	
	if(root.left==null && root.right==null) 
	{
		System.out.print(root.value+" ");
	}
	
	leafNodes(root.right);
	
	
	
}




public int findTreeDepth(Node root) {
    if (root == null) {
        return 0; 
    } else {
 
        int leftDepth = findTreeDepth(root.left);
        int rightDepth = findTreeDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}


public int countOfLeafNodes() {
    return countOfLeafNodes(this.root);
}

public int countOfLeafNodes(Node root) {
    if (root == null) {
        return 0;
    }
    
    if (root.left == null && root.right == null) {
        return 1; // Current node is a leaf node.
    }

    int leftCount = countOfLeafNodes(root.left);
    int rightCount = countOfLeafNodes(root.right);

    return leftCount + rightCount;
}






public static void main(String[] args) {
	BinarySearchTree tree=new BinarySearchTree();
	Scanner sc= new Scanner(System.in);

	tree.insert(10);
	tree.insert(5);
	tree.insert(15);
	tree.insert(3);
	tree.insert(7);
	tree.insert(17);
	 
    System.out.print("pre order  :");
	tree.preOrder();
	System.out.println();
	System.out.print("post order :");
	tree.postOrder();
	System.out.println();
	System.out.print(" inorder   :");
	tree.inorder();
	System.out.println();

	 System.out.print("pre order  :");
	 tree.preOrderIterative();

	 	System.out.println();
		System.out.print("post order :");
		tree.postOrderIterative();
		System.out.println();
		System.out.print(" inorder   :");
		tree.inorderIterative();
		System.out.println();
		System.out.print("post order :");
		tree.postOrderIteravtive();
		System.out.println();
	tree.leafNodes();
int count =tree.countOfLeafNodes();
System.out.println();

System.out.print(count);

}

}

