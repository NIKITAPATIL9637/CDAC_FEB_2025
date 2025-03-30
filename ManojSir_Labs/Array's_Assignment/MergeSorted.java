import java.util.*;
public class MergeSorted{
	
	public static int[] mergeSortedArrays(int[] arr1, int[] arr2){
		int[] mergedArray = new int[arr1.length + arr2.length];
		int i=0, j=0, k=0;
		
		// Traverse both arrays and merge them into one
		while(i<arr1.length && j<arr2.length){
			if(arr1[i] <= arr2[j]){
				mergedArray[k++] = arr1[i++];
			}
			else{
				mergedArray[k++] = arr2[j++];
			}
		}
		
		//Copy remaining elements of arr1, if any
		while(i < arr1.length){
			mergedArray[k++] = arr2[j++];
		}
		
		// Copy remaining elements of arr2, if any
		while(j < arr2.length){
			mergedArray[k++] = arr2[j++];
		}
		
		return mergedArray;
    }
	
	public static void main(String args[]){
		int arr1[] = {1,3,5};
		int arr2[] = {2,4,6};
		
		int mergedArray[] = mergeSortedArrays(arr1, arr2);
		
		System.out.println("Merged sorted array: " + Arrays.toString(mergedArray));
	}
	
}