package Array;

import java.util.ArrayList;
import java.util.List;

public class removeDuplicateValues {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8};
	int newArray[]=removeDupe(arr);
	for(int j=0;j<=arr.length;j++) 
	{
System.out.println(newArray[j]);	}
}

public static int[]removeDupe(int[] arr) {
	List<Integer>temparr=new ArrayList<>();
for(int i:arr) {
	if(!temparr.contains(i)){
		temparr.add(i);
	}}
	int arr2[]=new int[arr.length];
	for(int j=0;j<=arr.length;j++) 
	{
		arr2[j]=temparr.get(j);
	}

return arr2;
}
}
