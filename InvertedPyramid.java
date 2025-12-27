public class InvertedPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 2 * (n - i) + 1; j > 0; j--) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
