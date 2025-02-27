public class Q4{
     public static void main(String args[]){
     int n = 1234;
     int reversedNumber = 0;
 
     while(n > 0){
        int digit = n % 10;
        reversedNumber = reversedNumber * 10 + digit;
        n = n / 10;
    }
    System.out.println("Reversed Number is: " + reversedNumber);
  }
}