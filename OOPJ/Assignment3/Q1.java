import java.util.*;
public class Q1{
    public static void main(String args[]){
	    int []arr = {12, 45, 23, 10, 25};
		
		int smallest = arr[0];
		int largest = arr[0];
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] < smallest){
				smallest = arr[i];
			}
			if(arr[i] > largest){
				largest = arr[i];
			}
		}
		
		System.out.println("Smallest Number of array is: " + smallest);
		System.out.println("Smallest Number of array is: " + largest);
	}
}