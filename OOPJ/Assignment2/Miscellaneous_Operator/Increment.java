public class Increment{
     public static void main(String args[]){
	 int num = 5;
	 
	 int incrementValue = -(~num);
	 
	 System.out.println("Incremented value of " + num + " is: " + incrementValue);
	 }
}