public class Maximum{
	
	public static void findMaximum(int arr[]){
		int n = arr.length;
		int max = 0;
		
		for(int i=1; i<n; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("The maximum element is: " + max);
	}
	
	public static void main(String args[]){
		int arr[] = {1, 2, 4, 5, 6};
		findMaximum(arr);
	}
}