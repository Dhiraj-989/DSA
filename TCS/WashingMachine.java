import java.util.Scanner;

public class WashingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Weight of the clothes: ");
        int n = sc.nextInt();

        if( n >= 1 && n <= 2000){
            System.out.println("Time Estimated: 25 minutes");
        }else if( n > 2000 && n <= 4000){
            System.out.println("Time Estimated: 35 minutes");
        }else if(n > 4000 && n <= 7000){
            System.out.println("Time Estimated: 45 minutes");
        }else{
            System.out.println("Invalid Input");
        }
        
    }
}
