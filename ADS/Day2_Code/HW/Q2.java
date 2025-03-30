import java.util.*;
public class Q2{
	
	public static void multiplicationTable(int n, int i){
		if(i>=10){
			return;
		}
		System.out.println(n + " * " + i + " = " + (n*i));
		
		multiplicationTable(n,i+1);
	}
	
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scn.nextInt();
		multiplicationTable(n, 1);
	}
}