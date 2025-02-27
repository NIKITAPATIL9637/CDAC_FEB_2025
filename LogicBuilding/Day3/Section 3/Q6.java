public class Q6{
     public static void main(String args[]){
        int count =0;
        int num = 2;

        while(count < 5){
            if(isPrime(num)){
               System.out.print(num + " ");
               count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i=2; i*i<=n; i++){
           if(n%i == 0) return false;
        }
        return true;
    }
}



