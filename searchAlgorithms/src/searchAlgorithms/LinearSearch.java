package searchAlgorithms;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
			int arr[]= {1,2,3,4,5,6,7,44,77,88,55,44,99,66,44};
			System.out.println("enter the number to search : ");
			int value=scanner.nextInt();
			int index=linearSearch(value,arr);
			if(index==-1)
			{
				System.out.println("element not found......!");
			}else {
				System.out.println("found the element at position : "+index);
			}
	}

	private static int linearSearch(int value,int arr[]) {
		for(int i=0;i<=arr.length-1;i++) 
		{
			if(arr[i]==value) 
			{
				return arr[i];
			}
		}
		return -1;
	}

}
