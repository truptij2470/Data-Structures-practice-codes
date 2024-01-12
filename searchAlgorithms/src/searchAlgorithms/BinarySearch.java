package searchAlgorithms;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number to search : ");
		int value=scanner.nextInt();
		int arr[]= {1,2,3,4,5,6,7,44,77,88,55,44,99,66,44};
		int index = binarySearch(arr,value);
		if(index==-1) 
		{
			System.out.println("the number not found.....!");
		}else {
			System.out.println("the number "+value+" found at position "+index);
		}
	}

	private static int binarySearch(int[] arr, int value) 
	{   int low=0,high=arr.length-1;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(arr[mid]==value) 
			{
				return mid;
			}
			if(value>arr[mid]) //or if(arr[mid]<value)
			{
				low=mid+1;
			}else {
				high=mid-1;
			}
			
		}
		return -1;
	}

}
