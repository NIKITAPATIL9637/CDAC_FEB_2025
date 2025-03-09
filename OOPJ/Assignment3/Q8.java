import java.util.*;
public class Q8{
    public static void main(String args[]){
	
	int []arr1 = {10,20,30,40,50};
	int []arr2 = {5,10,15,20,25};
	
	int []mergedArray = new int[arr1.length + arr2.length];
	System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
    System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
	System.out.println(Arrays.toString(mergedArray));
	}
}