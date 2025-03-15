public class SubArrayGivenSum{
	
	public static void findSubArrayWithGivenSum(int arr[], int sum){
		int start = 0;
		int currentSum = 0;
		
		for(int end=0; end<arr.length; end++){
			currentSum = currentSum + arr[end];
			
			while(currentSum > sum && start<=end){
				currentSum = currentSum - arr[start];
				start++;
			}
			
			if(currentSum == sum){
				System.out.println("Subarray with the given sum is: ");
				for(int i = start; i<=end ; i++){
					System.out.print(arr[i] + " ");
				}
				return;
			}
		}
		System.out.println("No subarray with the given sum exists.");
	}
	
	public static void main(String args[]){
		int arr[] = {1, 2, 3, 7, 5};
		int sum = 12;
		findSubArrayWithGivenSum(arr, sum);
	}
}