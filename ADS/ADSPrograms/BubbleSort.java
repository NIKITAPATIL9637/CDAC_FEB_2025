import java.util.*;
public class BubbleSort{
    
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int k = 0; k < n; k++) {
            arr[k] = scn.nextInt();
        }
		
		for(int i=0; i<arr.length-1; i++){
		    for(int j=0; j<arr.length-i-1; j++){
		        if(arr[j] > arr[j+1]){
		            int temp = arr[j];
		            arr[j] = arr[j+1];
		            arr[j+1] = temp;
		        }
		    }
		}
		printArray(arr);
	}
}