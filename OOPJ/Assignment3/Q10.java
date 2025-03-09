import java.util.*;
public class Q10{
	
	public static void findUnion(int arr1[], int arr2[]){
		Set<Integer> unionSet = new HashSet<>();
		
		for(int num : arr1){
			unionSet.add(num);
		}
		for(int num : arr2){
			unionSet.add(num);
		}
		
		System.out.println("Union of two arrays: " + unionSet);
	}
	
	public static void findIntersection(int arr1[], int arr2[]){
		Set<Integer> set = new HashSet<>();
		Set<Integer> intersectionSet = new HashSet<>();
		
		for(int num : arr1){
			set.add(num);
		}
		for(int num : arr2){
			if(set.contains(num)){
				intersectionSet.add(num);
			}
		}
		System.out.println("Intersection of two arrays: " + intersectionSet);
	}
	
    public static void main(String args[]){
	int arr1[] = {12,34,67,89,100};
    int arr2[] = {12,54,67,98,100};

	findUnion(arr1,arr2);
	findIntersection(arr1,arr2);
	}

} 