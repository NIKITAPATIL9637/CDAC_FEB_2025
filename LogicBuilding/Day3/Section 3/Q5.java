public class Q5{
    public static void main(String args[]){
        int a = 0;
        int b = 1;
 
        System.out.println(a + " " + " ");

        while(true){
           int next = a + b;
           if(next > 21) break;
           System.out.println(next + " ");
           a = b;
           b = next;
           
        }
    }
}