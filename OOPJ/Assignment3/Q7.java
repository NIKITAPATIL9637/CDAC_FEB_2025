import java.util.*;
public class Q7{

public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle, where k > n
        
        reverse(nums, 0, n - 1);   // Reverse entire array
        reverse(nums, 0, k - 1);   // Reverse first k elements
        reverse(nums, k, n - 1);   // Reverse remaining elements
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left]; //Third variable
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String args[]){
	int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
	}
}