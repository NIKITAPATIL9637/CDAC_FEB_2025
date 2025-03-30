class Recursion{
   static void show(){
         System.out.println("Hii show!");
         show();
   }

   public static void main(String args[]){
         show();
   }
}