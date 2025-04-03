public class QuickSort{
	public static int partision(int arr[], int low, int high){
		int pivot = arr[high];
		int i = low-1;
		
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
			int pivotindex = partision(arr, low, high);
			
			quickSort(arr, low, pivotindex-1);
			quickSort(arr, pivotindex+1, high);
		}
	}   
	
	public static void main(String args[]){
		int arr[] = {1,4,2,3,5};
		int n = arr.length;
		
		quickSort(arr, 0, n-1);
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}

//TimeComplexity - worst - O(n)2 every time pivot become smallest element or largest element
//average - O(nlogn)