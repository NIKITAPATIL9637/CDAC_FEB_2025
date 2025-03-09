import java.util.*;
public class Q11{
  public static int[] findSubArray(int[]arr, int sub){
     int left = 0, currentSum = 0;
	 
	 for(int right=0; right<arr.length; right++){
	    currentSum += arr[right];
		
		while(currentSum>sub && left<=right){
		   currentSum -= arr[left];
		   left++;
		}
		
		if(currentSum == sub){
		   return Arrays.copyOfRange(arr, left, right + 1);
		}
	 }
	 return new int[0];
  } 


   public static void main(String args[]){
      int []arr = {1,4,5,7,10,3};
	  int sub = 66;
	  System.out.println(Arrays.toString(findSubArray(arr, sub)));
   }
}