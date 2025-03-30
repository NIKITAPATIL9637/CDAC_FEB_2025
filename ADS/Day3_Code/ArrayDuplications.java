import java.util.*;
import java.util.Collection;
import java.util.Arrays;
class ArrayDuplications{
	/* colection approach
	public static void duplicatesFind(int arr[]){
		HashSet<Integer> seen = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();
		
		for(int num : arr){
			if(!seen.add(num)){
				duplicates.add(num);
			}
		}
		System.out.println("The duplicates keys into the array is: "+ duplicates);
	}*/
	
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,7,8,8,9};
		
		//duplicatesFind(arr);
		
		/* Using built in collections
		HashSet<Integer> seen = new HashSet<>();
		
		for(int num : arr){
			if(!seen.add(num)){
				System.out.println(num);
			}
		}*/
		
		/*Brut Force approach
		for(int i=0; i<arr1.length; i++){
			for(int j=i+1; j<arr1.length; j++){
				if(arr1[i] == arr1[j]){
					System.out.println(arr1[j]);
				}
			}
		
		}*/
		
		/*Sorting approach
		Arrays.sort(arr);
		System.out.print("Duplicates elements: " );
		
		for(int i=0; i<arr.length-1; i++){
			if(arr[i] == arr[i+1]){
				System.out.print(arr[i]);
			}
		}*/
	}
}