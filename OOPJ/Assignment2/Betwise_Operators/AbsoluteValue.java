import java.util.*;
public class AbsoluteValue{
      public static void main(String args[]){
	  int num = -22;
	  
	  System.out.println("Absolute value of " + num + " is: " + absolute(num));
	  }
	  
	  public static int absolute(int num){
		  
	  int mask = num >> 31;
	  
	  return (num+mask) ^ mask;
	  }
}