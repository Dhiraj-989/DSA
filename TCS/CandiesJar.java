import java.util.Scanner;

public class CandiesJar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of candies available: ");
        int n = sc.nextInt();

        System.out.println("Min candies inside in jar: ");
        int k = sc.nextInt();

        System.out.println("Order: ");
        int order = sc.nextInt();

        if(order >= 1 && order <= k){
            System.out.println("Candies sold: " + order);
            int sold = n - order;
            System.out.println("Candies available: " + sold);
        }else{
            System.out.println("Invalid Input");
            System.out.println("Candies left: " + n);
        }


    }
}
