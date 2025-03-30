public class Reverse{
	
	public static void reversedArray(int array[]){
		int start = 0;
		int end = array.length-1;
		
		while(start < end){
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			
			start++;
			end--;
		}
	}
	
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5};
		
		reversedArray(arr);
		
		System.out.println("The reversed array of given array is: " );
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}