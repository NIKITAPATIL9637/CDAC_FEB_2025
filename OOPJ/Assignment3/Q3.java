import java.util.*;
public class Q3{
    public static void main(String args[]){
	
	int []arr = {10,20,30,50,23};
	/* When they allow to use inbuilt functions.
	Arrays.sort(arr);
	
	int n = arr.length;
	
	int m = arr[n - 2];
	
	System.out.println(m);*/
	
	int largest = arr[0], secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest == Integer.MIN_VALUE ? "No second largest element" : secondLargest);
	}
}