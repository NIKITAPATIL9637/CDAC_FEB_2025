import java.util.*;

public class Q1{
	
	public static double sumSeries(int num){
		if(num==1){
			return 1.0;
		}
		
		double term = 1.0/num;
		
		if(num%2==0){
			return sumSeries(num-1)-term;//sub if even
		}else{
			return sumSeries(num-1)+term;//add if odd
		}
	}
	
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		double result = sumSeries(num);
		
		System.out.println("Sum Series: " + result);
	}
}