public class Majority{
	
	public static int findCandidate(int arr[]){
		int candidate = 0;
		int count = 0;
		for(int num : arr){
			if(count == 0){
				candidate = num;
			}
			count = count + ((num == candidate) ? 1 : -1);
		}
		return candidate;
	}
	
    public static boolean isMajority(int arr[], int candidate){
		int count = 0;
		for(int num : arr){
			if(num == candidate){
				count++;
			}
		}
		return count > arr.length/2;
    }
	
	public static void main(String args[]){
		int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		int candidate = findCandidate(arr);
		
		if(isMajority(arr, candidate)){
			System.out.println("The majority element is: " + candidate);
		}
		else{
			System.out.println("There is no majority element.");
		}
	}
}