import java.util.*;
import java.util.Arrays;

public class MovingNumbers{
	
	public static void movingNumbers(int arr[]){
		int i=0;
		
		for(int j=0; j<arr.length;j++){
			if(arr[j] < 0){ //because frome o left all negative numbers
				//Swapping
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
	}
	
	public static void main(String args[]){
		int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		
		System.out.println("Original Array: " + Arrays.toString(arr));
		
		movingNumbers(arr);
		
		System.out.println("Rearranged array: " + Arrays.toString(arr));
	}
}