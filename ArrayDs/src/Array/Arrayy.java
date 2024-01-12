package Array;


public class Arrayy {
	private int arr[];
	private int maxsize;
public Arrayy(int size){
maxsize=size;
arr=new int[maxsize];
}
static int index=0;
  
    public void addElement(int n) {
    	
    	System.out.println("eneter the element : ");
    	arr[index++]=n;
    	
    }
    public void updateSize(int size) {
    }
    
    
    
    public void display() {
	for(int i :arr) {
		if(i>0)
		System.out.print(arr[i]+" ");
	                }
    }

   
    
    
    public void reverseArray() {
    	int start=0;
    	int end=maxsize-1;
    	while(start<end) {
    	int temp=arr[end];
    	arr[end]=arr[start];
    	arr[start]=arr[temp];
    	start++;
    	end--;
    	}
    	System.out.println("array is reversed..........");
    	for(int i:arr) {
    		System.out.println(i+" ");
    	}
    }
    
    public void replace(int index,int n ) throws ArrayCustomException {
    	if(index<maxsize && index>0) {
    	int temp =arr[index];
    	arr[index]=n;
    	System.out.println(temp+"on index "+index+" is relaced by "+n);}
    	else {throw new ArrayCustomException("invalid index.....");}
    }
    
    public void sumOfArray() {
    	int sum=0;
    	for(int i:arr) {
    		sum+=i;
    	}
    	System.out.println("the sum of the elements in the array is : "+sum);
    }
    public void averageOfArray() {
	 int sum=0;
 	for(int i:arr) {
 		sum+=i;
 	}
 	int avg=(sum/maxsize);
 	System.out.println("the sum of the elements in the array is : "+avg);
 }
    public void maxArrElement()
    {int max=0;
	for(int i:arr) {
		if(i>max) {
			max=arr[i];
		}
	}
	System.out.println("the max element in array is : "+max);
	}

    public void displayEven() {
	for(int i:arr) {
		if(i%2==0) {}
		System.out.print(i+" ");
	}
    }
    public void displayOdd() {
	for(int i:arr) {
		if(i%2!=0) {}
		System.out.print(i+" ");
	}
    }
}
