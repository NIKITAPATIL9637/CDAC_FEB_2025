public class MoveZeros{
	public static void moveZeros(int arr[]){
		int index = 0;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] != 0){
				arr[index++] = arr[i];
			}
		}
		
		while(index < arr.length){
		    arr[index++] = 0;
		}
	}	
	
	public static void main(String args[]){
		int arr[] = {1, 0, 2, 0, 4, 3, 0};
		moveZeros(arr);
		
		for(int num : arr){
			System.out.print(num + " ");
		}
	}
}