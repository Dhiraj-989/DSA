/*A party has been organised on cruise. The party is organised for a limited time(T). The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. The task is to find the maximum number of guests present on the cruise at any given instance within T hours.

Example 1:
Input :

5    -> Value of T
[7,0,5,1,3]  -> E[], Element of E[0] to E[N-1], where input each element is separated by new line 
[1,2,1,3,4]   -> L[], Element of L[0] to L[N-1], while input each element is separate by new line.
Output :
8     -> Maximum number of guests on cruise at an instance. */



import java.util.Scanner;

public class CountGuest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("the no of hours: ");
        int n = sc.nextInt();

        System.out.println("Guests entry: ");
        int[] entry = new int[n];

        for (int i = 0; i < n; i++) {
            entry[i] = sc.nextInt();
        }

        System.out.println("Guests exit: ");
        int[] exit = new int[n];

        for (int i = 0; i < n; i++) {
            exit[i] = sc.nextInt();
        }

        int diff = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            diff = diff + entry[i] - exit[i];
            max = Math.max(max, diff);
        }
        System.out.println(max);


    }

}
