public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swap using += and -=
        a += b; // a = a + b (a = 5 + 10 = 15)
        b = a - b; // b = a - b (b = 15 - 10 = 5)
        a -= b; // a = a - b (a = 15 - 5 = 10)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}