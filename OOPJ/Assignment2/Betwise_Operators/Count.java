import java.util.*;

public class Count{
      public static void main(String args[]){
	  int num = 5;
	  
	  System.out.print("The binary represntation of " + num + " is: " + binarySet(num));
	  }
	  
	  public static int binarySet(int n){
	  int count = 0;
	  
	  while(n > 0){
	  n = n & (n-1);
	  count ++;
	  }
	  return count;
	  }
}