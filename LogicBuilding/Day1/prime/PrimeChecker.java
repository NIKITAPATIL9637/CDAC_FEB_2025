import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Taking an input from user
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        
        // Checking 
        if (isPrime(num)) {
            System.out.println("The number " + num + " is Prime.");
        } else {
            System.out.println("The number " + num + " is Not Prime.");
        }
    }
    public static boolean isPrime(int num){
       if(num<=1){
           return false;
       }
       for(int i=2; i<=Math.sqrt(num); i++){
          if(num % i == 0){ 
              return false;
          }
       }
       return true;
   }
}