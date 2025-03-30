import java.util.*;
public class SecondLargest{
	public static int findSecondLargest(int array[]){
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0; i<array.length; i++){
			if(array[i] > largest){
				secondLargest = largest;
				largest = array[i];
			}
		}
		return secondLargest;
	}
	
	public static void main(String args[]){
		int arr[] = {10,20,4,45,99};
		
		Arrays.sort(arr);
				
		int secondLargest = findSecondLargest(arr);

                System.out.println("The second largest element of given array is: " + secondLargest);		
	}
}