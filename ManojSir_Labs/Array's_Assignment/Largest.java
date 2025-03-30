import java.util.*;

public class Largest{
	public static int findLargest(int[] array) {
        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
}
	
	public static void main(String args[]){
		//one way using sort
		/*int arr[] = {10,25,47,85,12};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[arr.length-1]);*/
		
		int arr[] = {10,25,47,85,12};
		int largest = findLargest(arr);
		System.out.println("The largest element of given array: " + largest);
	}
}