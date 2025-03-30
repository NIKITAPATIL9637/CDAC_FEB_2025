import java.util.*;
public class NonRepetating{
	public static void findNonRepetating(int array[]){
		HashMap<Integer, Integer> elementCount = new HashMap<>();
		for(int num : array){
			elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
		}
		
		System.out.print("Element that appear only once: ");
		for(Map.Entry<Integer, Integer> entry : elementCount.entrySet()){
			if(entry.getValue() == 1){
				System.out.println(entry.getKey() + " ");
			}
		}
	}
	
	public static void main(String args[]){
		int arr[] = {1, 2, 3, 2, 1, 4};
		findNonRepetating(arr);
	}
}