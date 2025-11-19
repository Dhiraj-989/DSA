import java.util.Scanner;

public class TCSCountWheels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v=sc.nextInt();
        int w=sc.nextInt();
        

        float res = w/2 - v;

        System.out.println("four wheelers : " + res + " two wheelers : " + (v - res));
    }

}
