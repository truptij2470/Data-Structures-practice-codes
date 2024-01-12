package Array;
import java.util.Scanner;

public class ArrayTester {
  public static void main(String...ss) throws ArrayCustomException {
	  boolean exit = true;
	  try(Scanner scanner=new Scanner(System.in)){
		  Arrayy obj= new Arrayy(5);
	 try { while(exit){
		  System.out.println("\n1. enter the size of an array \n2. add elements in the array \n3. display array\n4. reverse the arry \n5. replace a specific elemnt \n6. sum of the array elements \n7. average of the array elemnts \n8. display even elements \n9. display odd elements \n10. maximum element in the array\n10. exit ");
		  int choice=scanner.nextInt();
		  switch(choice) {
		  case 1: 
		   System.out.println("enter the size of the array:");
			  int n=scanner.nextInt(); 
			 
			  break;
		  case 2:
			  System.out.println("enter the element:");
			  int ele=scanner.nextInt();
			  obj.addElement(ele);
			  break;
		  
		  case 3:
			  obj.display();
			  break;
		  case 4:
			  obj.reverseArray();
			  obj.display();
			  break;
		  case 5:
			  System.out.println("enter the element index : ");
			  int index=scanner.nextInt();
			  System.out.println("enter the value to insert in the index : ");
			  int value=scanner.nextInt();
			  obj.replace(index, value);
			  break;
			  
		  case 6:
			  obj.sumOfArray();
			  break;
		  case 7: 
			  obj.averageOfArray();
			  break;
		  case 8: 
			  obj.displayEven();
			  break;
		  case 9:
			  obj.displayOdd();
			  break;
		  case 10:
			  obj.maxArrElement();
			  break;
		  case 11:
			  exit=false;
		  break;
		  
	  }
	 }}catch(Exception e) {e.printStackTrace();}
	  
	  
	  
	  }
	  
	  
	  
  }
  
}
