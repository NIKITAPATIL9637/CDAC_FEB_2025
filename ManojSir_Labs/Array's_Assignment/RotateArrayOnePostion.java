import java.util.*;
public class RotateArrayOnePostion{
	public static void leftRoatateByOne(int array[]){
		int firstElement = array[0];
		
		for(int i=0; i<array.length-1; i++){
			array[i] = array[i+1];
		}
		array[array.length-1] = firstElement;
	}
	
	public static void main(String args[]){
		int arr[] = {10,20,30,40,50};
		
		leftRoatateByOne(arr);
		
		System.out.println("Array after left rotation by one postion: " + Arrays.toString(arr));
	}
}