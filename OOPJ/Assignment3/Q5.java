public class Q5{
    public static void main(String args[]){
	int arr[] = {12, 34, 56, 13, 15};
	
	int sum = 0;
	
	for(int num : arr){
	   sum = sum + num;
	}
	System.out.println(sum);
	
	double avg = sum / arr.length;
	System.out.println(avg);
	}
}