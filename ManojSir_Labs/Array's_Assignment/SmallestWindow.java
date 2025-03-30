public class SmallestWindow{
	
	public static void smallestWindow(int arr[]){
		int n = arr.length;
		int start = -1;
		int end = -1;
		
		//check for left positions
		for(int i=0; i<n-1; i++){
			if(arr[i] > arr[i+1]){
				start = i;
				break;
			}
		}
		
		//check for array already sorted
		if(start == -1){
			System.out.println("Array is already sorted!");
			return;
		}
		
		//check for right positon
		for(int i= n-1; i>0; i--){
			if(arr[i] < arr[i-1]){
				end = i;
				break;
			}
		}
		
		//find minimum and maximum values in subarray
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=start; i<=end; i++){
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		
		//expanding start and end boundaries
		while(start>0 && arr[start - 1]>min){
			start--;
		}
		while(end<n-1 && arr[end+1]<max){
			end++;
		}
		
		//printing subarray
		System.out.println("The smallest subarray to sorted is: ");
		for(int i=start; i<=end; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String args[]){
		int arr[] = {1, 3, 5, 8, 7, 6, 9, 10};
		smallestWindow(arr);
	}
}