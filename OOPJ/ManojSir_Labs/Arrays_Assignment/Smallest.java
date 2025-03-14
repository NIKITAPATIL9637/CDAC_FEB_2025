import java.util.*;
public class Smallest{
	public static void main(String args[]){
		int arr[] = {10,25,47,85,12};
		int smallest = findSmallest(arr);
		System.out.println("The smallest number in given array: " + smallest);
		
		//anouther way using array sort
		/*Arrays.sort(arr);
		System.out.println(arr[0]);*/
	}
	
	public static int findSmallest(int array[]){
		int smallest = array[0];
		
		for(int i=1; i<array.length; i++){
			if(array[i] < smallest){
				smallest = array[i];
			}
		}
		return smallest;
	}
}