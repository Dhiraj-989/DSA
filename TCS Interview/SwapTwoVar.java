import java.util.Scanner;

public class SwapTwoVar {
    public static void thirdVar(int a, int b){
        System.out.println("Before swapping: a = " + a + " b = " + b );

        int temp = b;
        b = a;
        a = temp;

        System.out.println("After swapping: a = " + a + " b = " + b);
    }

    public static void withOutThird(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("SUM: ");
        System.out.println(a + " " + b);

    }

    public static void XOR(int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("XOR: ");
        System.out.println(a + " " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        thirdVar(a, b);
        withOutThird(a, b);
        XOR(a, b);
        
    }
}
