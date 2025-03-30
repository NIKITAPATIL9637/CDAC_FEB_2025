public class BinarySearch{
	
	public static int bSearch(int arr[], int left, int right, int key){
		if(left > right){
			return -1;
		}
		int mid = left + (right - left)/2;
		if(arr[mid] == key){
			return mid;
		}else if(arr[mid] > key){
			return bSearch(arr, left, mid-1, key);//search left
		}else{
			return bSearch(arr, mid+1, right, key);//search right
		}
	}
	
	public static void main(String args[]){
		int arr[] = {1, 3, 5, 7, 9};
		int key = 5;
		
		int result = bSearch(arr, 0, arr.length-1, key);
		
		if(result != -1){
			System.out.println("Element found at index: " + result);
		}else{
			System.out.println("Element is not found!");
		}
	}
}