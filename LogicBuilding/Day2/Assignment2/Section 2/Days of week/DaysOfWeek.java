import java.util.*;
public class DaysOfWeek{
       public static void main (String args[]){
           Scanner scn = new Scanner(System.in);
           System.out.print("Enter an integer 1 to 7 for the day of the week: ");
           int day = scn.nextInt();
           
           
           switch(day){
                 case 1: 
                 case 2:
                 case 3:
                 case 4:
                 case 5:
                 
            switch(day) {
                 case 1:
                 case 2:
                 case 3:
                 case 4:
                 case 5:
                      System.out.println("Day: " + getDayName(day));
                      break;
           }
           break;
           case 6:
           case 7:
           switch(day){
                 case 6:
                 case 7:
                      System.out.println("Day: " + getDayName(day) + " - weekday ");
           }
           break;

           default:   System.out.println("Invalid input, please enter an integer between 1 to 7.");
           break;
           }
       }

       private static String getDayName(int day){
           switch(day){
                  case 1: return "Monday";
                  case 2: return "Tueday";
                  case 3: return "Wednesday";
                  case 4: return "Thrusday";
                  case 5: return "Friday";
                  case 6: return "Saturday";
                  case 7: return "Sunday";

                  default: return "Unknown";
           }
       }
}