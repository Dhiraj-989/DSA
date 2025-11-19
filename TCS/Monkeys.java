import java.util.Scanner;

public class Monkeys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("n");
        int n = sc.nextInt();
        System.out.println("k");
        int k = sc.nextInt();
        System.out.println("j");
        int j = sc.nextInt();
        System.out.println("m");
        int m = sc.nextInt();
        System.out.println("p");
        int p = sc.nextInt();

        int ateBanana = 0;
        int atePeanuts = 0;

        if( n < 0 || k < 0 || j < 0 || m < 0 || p < 0){
            System.out.println("Invalid Input");
        }else{
            ateBanana = m / k;
            m = m % k;

            atePeanuts = p / j;
            p = p % j;

            n = n - ateBanana - atePeanuts;

            if( m != 0 || p != 0 ){
                n = n - 1;
            }

            System.out.println(n);
        }

        sc.close();


        
    }
}
