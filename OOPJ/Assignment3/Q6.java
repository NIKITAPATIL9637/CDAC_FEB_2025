import java.util.*;
public class Q6{

    public static void main(String args[]){
	int arr[] = {12,24,56,24,23,56,15};
	/*Set<Integer> removeDuplicates = new HashSet<>();
	
	for(int num : arr){
		removeDuplicates.add(num);
	}
	ArrayList<Integer> list = new ArrayList<>(removeDuplicates);
	System.out.println(list);
	*/
	
	int[] uniqueArr = Arrays.stream(arr).distinct().toArray();
	
	System.out.println(Arrays.toString(uniqueArr));
	
	}
}