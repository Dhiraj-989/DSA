public class Fibonacci {
    public static void brute(int n){
        int first = 0;
        int second = 1;


        System.out.print(first + " " + second + " ");

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }

    public static int recursive(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return recursive(n-1) + recursive(n - 2);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Brute: ");
        brute(n);
        System.out.println();

        System.out.println("recursive: ");

        for (int i = 0; i < n; i++) {
            System.out.print(recursive(i) + " ");
        }
    }
}
