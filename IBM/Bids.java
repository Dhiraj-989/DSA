/*A number of bids are received for a project. Determine the number of distinct pairs of project 
costs where their absolute difference is some target value. Two pairs are distinct if they differ 
in at least one value.

Example:
n = 3
projectCosts = [1, 3, 5]
target = 2

There are 2 pairs: (1, 3) and (3, 5) with the target difference 2.
Therefore, 2 is returned. */

import java.util.*;

public class Bids {
    public static int countPairsWithDifference(int[] arr, int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(Math.abs(arr[i] - arr[j]) == target){
                    count++;
                }
            }
        }
        return count;
    }

    public static int optimal(int[] arr, int target){
        int count = 0;
        HashSet<Integer> set  = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for(int cost : set){
            if(set.contains(cost + target)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter target: ");
        int target = sc.nextInt();

        System.out.println("Enter array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int res = countPairsWithDifference(arr, target);
        System.out.println(res);

        int opRes = optimal(arr, target);
        System.out.println(opRes);
    }
}
