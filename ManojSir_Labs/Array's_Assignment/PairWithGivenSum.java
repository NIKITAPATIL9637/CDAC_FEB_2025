import java.util.*;
public class PairWithGivenSum{
	
	public static void findPairWithGivenSum(int arr[], int sum){
		HashMap<Integer, Integer> pair = new HashMap<>();
		
		System.out.println("Pairs with sum " + sum + " is: ");
		
		for(int num : arr){
			int complement = sum - num; //find complement
			
			//checks if the complement present or not
			if(pair.containsKey(complement)){
				for(int i=0; i < pair.get(complement); i++){
					System.out.print("(" + complement + "," +num + ")");
				}
			}
			pair.put(num, pair.getOrDefault(num,0)+1);//add current number to map or update its count
		}
	}
	
	public static void main(String[] args){
		int arr[] = {1, 5, 7, -1, 5};
		int sum = 6;
		
		findPairWithGivenSum(arr, sum);
	}
}