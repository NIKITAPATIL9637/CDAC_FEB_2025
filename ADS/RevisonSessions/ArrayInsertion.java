import java.util.*;
public class ArrayInsertion{
	public static void main(String args[]){
		int arr[] = {2,4,5,7,8};
		int element = 9;
		int position = 3;
		
		int arr1[] = new int[arr.length + 1];
		//adding given array into new array elements
		for(int i=0; i<position; i++){
				arr1[i] = arr[i];
		}
		//Insertion of element
		arr1[position] = element;
		
		//copying element from the position
		for(int i=position; i<arr.length; i++){
			arr1[i+1] = arr[i];
		}
		System.out.println(Arrays.toString(arr1));
	}
}