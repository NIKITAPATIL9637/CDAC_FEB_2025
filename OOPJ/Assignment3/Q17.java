import java.util.*;
public class Q17{
    public static void main(String args[]){
	
	int []arr = {2, 3, 5, 7, -7, 5, 8, -5};
	
	Arrays.sort(arr);
	
	System.out.println(Arrays.toString(arr));
	
	int lastIndex = arr[arr.length -1];
	int secondLastIndex = arr[arr.length-2];
	
	int product = lastIndex * secondLastIndex;
	
	System.out.println(Arrays.toString(arr));
	System.out.println("Multiplication of Last Two Elements: " + product);
	}
}