public class Missing{
	
	public static void findMissing(int arr[]){
		int n = arr.length+1;
		int expectedSum = n*(n+1)/2;
		int actualSum = 0;
		
		for(int num : arr){
			actualSum = actualSum + num;
		}
		
		int missingNo = expectedSum - actualSum;
		System.out.println("The missing number is: " + missingNo);
	}
	
	public static void main(String args[]){
		int arr[] = {1, 2, 4, 5, 6};
		findMissing(arr);
	}
}