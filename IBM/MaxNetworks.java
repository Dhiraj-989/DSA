/*A software development company is working to create several shared computing systems
throughout an office.

For computers to be on the same network, the following constraints must be satisfied:

They must be adjacent to one another in the given order.

There must be at least a minimum number of computers in a network.

The total processing speed of the network (sum of the speeds of the computers in that network) 
must be at least a certain threshold.

A computer can belong to only one network.

Given:

The processing speeds of the computers,

The order of the computers,

And the network constraints,

Determine the maximum number of networks that can be formed.

Example
n = 6
speed = [5, 7, 9, 12, 10, 13]
minComps = 2
speedThreshold = 15 */

import java.util.Scanner;

public class MaxNetworks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] speed = new int[n];
        for (int i = 0; i < speed.length; i++) {
            speed[i] = sc.nextInt();
        }
        int minComps = sc.nextInt();
        int speedThreshold = sc.nextInt();

        int l = 0;
        int r = 0;

        int sum = 0;
        int count = 0;

        while( r < n){
            sum += speed[r];
            int size = r - l + 1;
    
            if(sum >= speedThreshold && size >= minComps){
                count++;

                r++;
                l = r;
                sum = 0;
            }
            else{
                r++;
            }
        }
        System.out.println(count);
    }
}
