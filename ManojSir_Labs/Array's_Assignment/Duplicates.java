import java.util.HashSet;
public class Duplicates{
	public static void findDuplicates(int array[]){
		HashSet<Integer> seen = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();
		
		for(int num : array){
			if(!seen.add(num)){
				duplicates.add(num);
			}
		}
		System.out.println("The duplicates elements in array is: " + duplicates);
	}
	
	public static void main(String args[]){
		int arr[] = {4, 5, 6, 7, 5, 4, 9};
		
		findDuplicates(arr);
		
	}
}