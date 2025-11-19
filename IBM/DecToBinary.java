import java.util.Scanner;

public class DecToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] binary = new int[32];
        int i = 0;
        while(n > 0){
            binary[i] = n % 2;
            n = n / 2;
            i++;
        }

        for( i = i - 1; i >= 0; i--){
            System.out.print(binary[i]);
        }
    }
}
