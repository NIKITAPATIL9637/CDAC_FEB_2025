public class Q20{
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = n; j >= n - i; j--) {
                if (j != n) {
                    System.out.print("*");
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}