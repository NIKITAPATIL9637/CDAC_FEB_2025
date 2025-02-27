import java.util.*;
public class DiscountCalculation{
       public static void main(String args[]){
              Scanner scn = new Scanner(System.in);

              System.out.print("Enter the total purchase amount Rs.: ");
              double purchaseAmount = scn.nextInt();

              System.out.print("Do you have a membership card? Yes/No: ");
              String membership = scn.next().trim().toLowerCase();

              double discount = 0;
 
              if(purchaseAmount >= 1000){
                  discount = 20;
              }
              else if(purchaseAmount >= 500){
                  discount = 10;
              }
              else{
                  discount = 5;
              }
  
              if(membership.equals("yes")){
                  discount = discount + 5;
              }
 
              double discountAmount = (discount / 100) * purchaseAmount;
              double finalAmount = purchaseAmount - discountAmount;

              System.out.println("Applicable Discount: " + discount + "%");
              System.out.println("Discount Amount: Rs. " + discountAmount);
              System.out.println("Final Amount to Pay: Rs. " + finalAmount);
       }
}