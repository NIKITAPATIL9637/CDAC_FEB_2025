public class ArraySorted{
	public static boolean isSorted(int array[]){
		for(int i=0; i<array.length-1; i++){
			if(array[i] > array[i+1]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
	int arr1[] = {1,2,3,4,5};
	int arr2[] = {1,3,2,4,5};
	
	System.out.println("Is arr1 sorted? " + isSorted(arr1));
	System.out.println("Is arr2 sorted? " + isSorted(arr2));
    }
}