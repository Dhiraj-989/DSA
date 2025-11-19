
import java.util.Scanner;

public class BusFare {

    public static String getFare(String Source, String Destination){
        String[] busStops = { "TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA" };
        int[] path = {800, 600, 750, 900, 1400, 1200, 1100, 1500};

        Source = Source.toUpperCase();
        Destination = Destination.toUpperCase();

        int srcIndex = -1, destIndex = -1;
        for (int i = 0; i < path.length; i++) {
            if(busStops[i].equals(Source)) srcIndex = i;
            if(busStops[i].equals(Destination)) destIndex = i;
        }

        if( srcIndex == -1 || destIndex == -1){
            return "Invalid input";
        }

        if( srcIndex == destIndex){
            return "0.0 INR";
        }

        int distance = 0;
        int n = busStops.length;


        int i = (srcIndex + 1) % n;   

        while (true) {
            distance += path[i];
            if (i == destIndex) break;   
            i = (i + 1) % n;
        }
        double fare = Math.ceil(distance * 0.005);

        return  fare + " INR";

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter source: ");
        String source = sc.next();

        System.out.println("Enter Destination: ");
        String destination = sc.next();

        System.out.println(getFare(source, destination));
        
    }
}
