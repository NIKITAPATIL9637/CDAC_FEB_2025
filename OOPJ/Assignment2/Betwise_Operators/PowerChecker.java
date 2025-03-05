public class PowerChecker{
      public static void main(String args[]){
	  int num = 16;
	  
	  if(isPowerOfTwo(num)){
	      System.out.println(num + " is a powers of 2.");
	  }
	  else{
	      System.out.println(num + " is not the power of 2.");
	  }
	  }
	  
	  public static boolean isPowerOfTwo(int n){
	     return (n>0) && ((n & (n - 1) ) == 0);
	  }

}