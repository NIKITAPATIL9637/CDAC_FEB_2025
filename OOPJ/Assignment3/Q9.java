public class Q9{
  public static int findMissing(int arr[], int n){
  int sumArr = 0;

  int sumN = n*(n+1)/2; //23/2 = 11.1

  for(int num : arr){
   sumArr = sumArr + num;
  }
  return sumN - sumArr;
  }



   public static void main(String args[]){
       int[] arr = {1,2,3,5,6};
	   int n = 6;
	   
	   System.out.println("Missing Number: " + findMissing(arr, n));
   }
}