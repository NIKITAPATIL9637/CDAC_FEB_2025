import java.util.*;

public class ArrayOperations {

    public static int[] insertion(int arr[], int element, int index) {
        if (index < 0 || index > arr.length) {
            System.out.println("Invalid index for insertion");
            return arr;
        }

        int newArr[] = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }

    public static int[] deletion(int arr[], int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index for deletion");
            return arr;
        }

        int newArr[] = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            newArr[j++] = arr[i];
        }
        return newArr;
    }

    public static int searching(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void traversing(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        traversing(arr);

        arr = insertion(arr, 25, 2);
        traversing(arr);

        arr = deletion(arr, 2);
        traversing(arr);

        int key = scn.nextInt();
        int index = searching(arr, key);
        System.out.println("Searching for " + key + ": " + (index != -1 ? "Found at index " + index : "Not Found"));
        
        for(int i=0; i<arr.length-1; i++){
		    for(int j=0; j<arr.length-i-1; j++){
		        if(arr[j] > arr[j+1]){
		            int temp = arr[j];
		            arr[j] = arr[j+1];
		            arr[j+1] = temp;
		        }
		    }
		}
        traversing(arr);
    }
}
