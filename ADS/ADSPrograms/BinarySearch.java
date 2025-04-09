import java.util.*;
public class binarySearch{
    
    public static int binarySearch(int arr[], int key){
        int left =0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left+(right - left)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
		int key = scn.nextInt();
		int index = binarySearch(arr, key);
		
		if(index != -1){
		    System.out.println(index);
		}else{
		    System.out.println("Element is not found!");
		}
	}
}