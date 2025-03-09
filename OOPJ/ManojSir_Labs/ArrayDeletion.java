import java.util.*;
public class ArrayDeletion{
    
	public static int[] removeElement(int arr[], int elementToRemove){
	
	     int count = 0;
		 
		 for(int num : arr){
		    if(num == elementToRemove){
			   count++;
			}
		 }
		 
		 if(count == 0){
		    System.out.println("The Element " + elementToRemove + " is not valid. Please try again!");
			count++;
		 }
		 
		 int []newarr = new int[arr.length - count];
		 int index = 0;
		 
		 for(int num : arr){
		    if(num != elementToRemove){
			   newarr[index++] = num;
			}
		 }
		 
		 return newarr;
	}
 
 
 
     public static void main(String args[]){
	 
	 int []arr = {10, 20, 30, 40, 50};
	 System.out.println("The Original array is: " + Arrays.toString(arr));
	 
	 arr = removeElement(arr, 30);
	 
	 System.out.println("The Modified array is: " + Arrays.toString(arr));
	 }

}