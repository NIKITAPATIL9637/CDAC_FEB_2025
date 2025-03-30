import java.util.*;
public class Intersection{
	
	public static void findIntersection(int arr1[], int arr2[]){
		HashSet<Integer> intersection = new HashSet<>();
		for(int num : arr1){
			intersection.add(num); //add arr1 into num
		}
		
		for(int num : arr2){
			if(intersection.contains(num)){//contains arr1 in num
				System.out.print(num + " ");
				intersection.remove(num);//remove duplicates
			}
		}
	}
	
	public static void main(String args[]){
		int arr1[] = {1, 2, 3, 4};
		int arr2[] = {3, 4, 5, 6};
		
		findIntersection(arr1, arr2);
	}
}