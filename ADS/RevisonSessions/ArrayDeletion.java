import java.util.*;
public class ArrayDeletion{
	public static void main(String args[]){
		int arr[] = {2,4,5,7,8};
		int position = 2;
		
		int arr1[] = new int[arr.length-1];
		
		for(int i=0; i<arr1.length; i++){
				arr1[i] = arr[i];
		}
		
		//ye element consider kar rha hai position + 1
		for(int i=position+1; i<arr.length; i++){
			arr1[i-1] = arr[i];
		}
		
		System.out.println(Arrays.toString(arr1));
	}
}