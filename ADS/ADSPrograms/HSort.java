import java.util.*;
public class HSort
{
    public static void heapify(int arr[], int n, int i){
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        
        //If left child greater than root
        if(l<n && arr[l] > arr[largest]){
            largest = l;
        }
        //If right child is greater than root
        if(r<n && arr[r] > arr[largest]){
            largest = r;
        }
        //If largest is not root
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            
            //recursively call heapify until the subtree sorted
            heapify(arr, n, largest);
        }
    }
    
    public static void heapSort(int arr[]){
        int n = arr.length;
        //building maxHeap property
        for(int i=n/2-1; i>=0; i--){
            heapify(arr, n, i);
        }
        //one by one extracting the elements
        for(int i=n-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            heapify(arr, i, 0);
        }
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
		    arr[i] = scn.nextInt();
		}
		heapSort(arr);
		for(int i=0; i<n; i++){
		    System.out.print(arr[i] + " ");
		}
	}
}
