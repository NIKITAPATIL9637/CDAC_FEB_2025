public class LargestSumSubArray{
	
	public static int findMaximumSum(int arr[]){
		int maxSoFar = Integer.MIN_VALUE;//store maximum sum so far
		int maxEndingHere = 0; //track current subarray
		
		for(int num : arr){
			maxEndingHere = maxEndingHere + num;
			
			if(maxEndingHere > maxSoFar){
				maxSoFar = maxEndingHere;//Update the maximum sum if current sum is higher 
			}
			
			if(maxEndingHere < 0){
				maxEndingHere = 0;//Reset the current sum to 0
			}
		}
		return maxSoFar;
	}
	
	public static void main(String args[]){
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		int maxSum = findMaximumSum(arr);
			System.out.println("The largest sum of a contigueous subarray is: " + maxSum);
	}
}