import java.util.*;
public class Area{
   public static void main(String args[]){
     Scanner scn = new Scanner(System.in);
     System.out.print("Enter the radius:: ");
     double radius = scn.nextDouble();
     
     double area = Math.PI*radius*radius;
     
     System.out.println("Area of the circle: " + area);
           
  }
}