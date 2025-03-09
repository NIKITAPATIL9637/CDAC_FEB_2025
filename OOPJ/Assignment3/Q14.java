import java.util.*;
public class Q14{
    public static void main(String args[]){
	Scanner scn = new Scanner(System.in);
	
	int []arr = new int[5];
	int []arreven = new int[5];
	int []arrodd = new int[5];
	
    //System.out.println(arr);
	
	int evencount = 0;
	int oddcount= 0;
	
	System.out.print("Enter integer 20 numbers: ");
	
	for(int i=0; i<5; i++){
	arr[i] = scn.nextInt();
	if(arr[i] % 2 == 0){
		arreven[evencount++] = arr[i];
	}	
	else{
		arrodd[oddcount++] = arr[i];
	}
	}
	
	System.out.print("Even numbers: ");
    for (int i = 0; i < evencount; i++) {
            System.out.println(arreven[i] + " ");
    }

    System.out.println("Odd numbers: ");
    for (int i = 0; i < oddcount; i++) {
            System.out.println(arrodd[i] + " ");
        }
    System.out.println();
	}
}