import java.util.Scanner;

public class HCF {
    public static void brute(int a, int b){
        int hcf = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if( a % i == 0 && b % i == 0){
                hcf = i;
            }
        }
        System.out.println(hcf);
    }

    public static void Euclid(int a, int b){
        while( b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        brute(a, b);
        Euclid(a, b);


    }
}
