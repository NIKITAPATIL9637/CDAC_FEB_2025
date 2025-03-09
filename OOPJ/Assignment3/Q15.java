import java.util.*;

public class Q15{
	
	public static void findZeroSumSubarrays(int[] nums){
		boolean flag = false;
		
		for(int start =0; start<nums.length; start++){
			int sum = 0;
			
			for(int end = start; end < nums.length; end++){
				sum = sum + nums[end];
				
				if(sum == 0){
					flag = true;
					List<Integer> subArray = new ArrayList<>();
					for(int i=start; i<=end; i++){
						subArray.add(nums[i]);
					}
					System.out.println("Sub-array with 0 sum: " + subArray);
				}
			}
		}
	}
	
public static void main(String[] args) {
        int[] nums1 = {1, 3, -7, 3, 2, 3, 1, -3, -2, -2};
        int[] nums2 = {1, 2, -3, 4, 5, 6};
        int[] nums3 = {1, 2, -2, 3, 4, 5, 6};

        System.out.println("Checking nums1:");
        findZeroSumSubarrays(nums1);

        System.out.println("\nChecking nums2:");
        findZeroSumSubarrays(nums2);

        System.out.println("\nChecking nums3:");
        findZeroSumSubarrays(nums3);
    }
}