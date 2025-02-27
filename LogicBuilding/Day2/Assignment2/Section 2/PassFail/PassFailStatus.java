import java.util.*;

public class PassFailStatus{
       public static void main(String args[]){
           Scanner scn = new Scanner(System.in);

           System.out.print("Enter marks for subject 1: ");
           int subject1 = scn.nextInt();

           System.out.print("Enter marks for subject 2: ");
           int subject2 = scn.nextInt();  

           System.out.print("Enter marks for subject 3: ");
           int subject3 = scn.nextInt();    

           int failcount = 0;

           if(subject1 < 40){
               failcount++;
           }
           if(subject2 < 40){
               failcount++;
           }
           if(subject3 < 40){
               failcount++;
           }
           
           if(failcount == 0){
                System.out.println("Congratulations! You have passes all subjects.");
           }
           else{
                System.out.println("You have failed in " + failcount + " subjects.");

           }
       }
}