public class Q4{
     public static void main(String args[]){
	 int []arr = {12,33,55,24,22};
	 
	 int evencount = 0;
	 int oddcount = 0;
	 
	 for(int num : arr){
	    if(num %2 == 0){
		  evencount++;
		}
		else{
		  oddcount++;
		}
	 }
	 System.out.println(evencount);
	 System.out.println(oddcount);
	 }
}