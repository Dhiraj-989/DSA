import java.util.Scanner;

public class WallsPaint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of interior walls: ");
        int n = sc.nextInt();

        System.out.println("Number of exterior walls: ");
        int m = sc.nextInt();

        System.out.println("SA of the interior walls: ");
        float[] interior = new float[n];
        for (int i = 0; i < n; i++) {
            interior[i] = sc.nextFloat();
        }

        System.out.println("SA of exterior walls: ");
        float[] exterior = new float[m];
        for (int i = 0; i < m; i++) {
            exterior[i] = sc.nextFloat();
        }

        float IntSA = 0;
        for (int i = 0; i < interior.length; i++) {
            IntSA += interior[i];
        }

        float IntCost = IntSA * 18;

        float ExtSA = 0;
        for (int i = 0; i < exterior.length; i++) {
            ExtSA += exterior[i];
        }

        float ExtCost = ExtSA * 12;

        float totalCost = IntCost + ExtCost;

        System.out.println("The total cost is : " + totalCost);

    }
}
