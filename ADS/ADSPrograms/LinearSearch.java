import java.util.*;
public class LinerSearch
{
    public static int linearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
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
		
		int index = linearSearch(arr, key);
		
		if(index != -1){
		    System.out.println(index);
		}else{
		    System.out.println("Element not found!");
		}
	}
}