import java.util.*;
public class QuickSort{
    
    public static int partisions(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        
        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    
    public static void quickSort(int arr[], int low, int high){
        if(low < high){
            int pivotIndex = partisions(arr, low, high);
            
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
		   arr[i] = scn.nextInt();
		}
		
		quickSort(arr, 0, n-1);
		
		for(int i=0; i<n; i++){
		    System.out.print(arr[i] + " ");
		}
	}
}