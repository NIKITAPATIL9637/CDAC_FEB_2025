import java.util.*;
public class RearrangeArray{
	
	public static int[] rearrangeArray(int arr[]){
		List<Integer> positives = new ArrayList<>();
		List<Integer> negatives = new ArrayList<>();
		
		for(int num : arr){
			if(num >= 0){
				positives.add(num);
			}
			else{
				negatives.add(num);
			}
		}
		
		int result[] = new int[arr.length];
		int i = 0;
		int pos = 0;
		int neg = 0;
		
		//merge positives and negatives number alternatively
		while(pos < positives.size() && neg < negatives.size()){
			result[i++] = negatives.get(neg++);
			result[i++] = positives.get(pos++);
		}
		return result;
	}
	
	public static void main(String args[]){
		int arr[] = {1, -2, 3, -4, 5, -6};
		int result[] = rearrangeArray(arr);
		
		System.out.print("Rearranged array: ");
		
		for(int num : result){
			System.out.print(num + " ");
		}
	}
}