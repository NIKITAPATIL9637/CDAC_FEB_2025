public class LinearSearch{
	static int search(int arr[], int search){
		for(int i=0; i<arr.length; i++){
			if(arr[i] == search){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int key = 5;
		
		int result = search(arr, key);
		System.out.print(result);
	}
}