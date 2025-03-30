class Recursion2{
   static int show(int n){
         if(n==4){ //Termination condition/ base condition
           return n;
         }else{
           return 2+show(n+1);
         }
   }

   public static void main(String args[]){
         int result = show(4);
         System.out.println(result);
   }
}