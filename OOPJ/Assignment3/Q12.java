import java.util.*;
public class Q12{
    public static void main(String args[]){
	Scanner scn = new Scanner(System.in);
	
	int size = scn.nextInt();
	
	int []arr = new int[size];
	
    System.out.println(arr);
	
	int evencount = 0;
	int oddcount= 0;
	int multipleof3 = 0;
	
	System.out.print("Enter integer 20 numbers: ");
	
	for(int i=1; i<=20; i++){
	if(i % 2 == 0){
		evencount++;
	}	
	else{
		oddcount++;
	}
	if(i % 3 == 0){
		multipleof3++;
	}
	}
	System.out.println("The even count is: " + evencount);
	System.out.println("The odd count is: " + oddcount);
	System.out.println("The Multiple of 3 count is: " +multipleof3);
	}
}