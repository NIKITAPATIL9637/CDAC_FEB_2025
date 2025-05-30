import java.util.*;
public class InsertionSort{
    
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int k=0; k<n; k++){
		    arr[k] = scn.nextInt();
		}
		
		for(int i=0; i<arr.length-1; i++){
		    int current = arr[i];
		    int j = i-1;
		    while(j>=0 && current < arr[j]){
		        arr[j+1] = arr[j];
		        j--;
		    }
		    arr[j+1] = current;
		}
		
		printArray(arr);
	}
}