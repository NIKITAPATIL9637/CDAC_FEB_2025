public class EvenNumber{
     public static void main(String args[]){
	 for(int num = 1; num <= 100; num++){
	   if((num & 1) == 0){
	      System.out.print(num + " ");
	   }
	 }
	 }
}