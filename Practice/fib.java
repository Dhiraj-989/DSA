public class fib {

    public static void resFib(int n){
        int first = 0;
        int second = 1;

        int res = 0;
        
        System.out.print(0+ " ");
        System.out.print(1 + " ");

        for (int i = 2; i <= n; i++) {
            res = first + second;
            first = second;
            second = res;
            System.out.print(res);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static int recFib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return recFib(n-1) + recFib(n-2);

    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Iterative: ");
        
        resFib(n);

        System.out.println("recursive: ");

        for (int i = 0; i <= n; i++) {
            System.out.print(recFib(i));
            System.out.print(" ");
        }
        
        
    }
}
