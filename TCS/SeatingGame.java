import java.util.Scanner;

public class SeatingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != arr[0]){
                count++;
            }else{
                count = 0;
            }
        }
        System.out.println(count);
    }
}
