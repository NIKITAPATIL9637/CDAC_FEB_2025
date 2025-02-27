public class Q11 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        
        int result = ++x + y--; // Pre-increment x, Post-decrement y
        
        System.out.println("Result: " + result);
        System.out.println("Value of x after operation: " + x);
        System.out.println("Value of y after operation: " + y);
    }
}