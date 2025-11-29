/*A router is receiving packets, one after another. Each arriving packet has some size.
The router is able to repackage the arriving packet together with the leftover of previous
packets into one packet, but only if the size is a power of two (1, 2, 4, 8, 16, …).

For each arriving packet:

Add its size to the leftover (if any).

Find the largest power of 2 less than or equal to the total.

That becomes the repackaged size.

The leftover is reduced accordingly.

Your task

Determine the largest repackaged size that the router can ever produce.

✅ Input Format

The first line contains an integer N, the number of packets.

The next N lines contain integers — the sizes of the arriving packets.

✅ Output Format

Print a single integer — the maximum repackaged size. */

import java.util.Scanner;

public class Router {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] packets = new int[n];

        for (int i = 0; i < packets.length; i++) {
            packets[i] = sc.nextInt();
        }
        int total = 0;
        int max = 0;

        if(packets.length == 1){
            System.out.println(Integer.highestOneBit(packets[0]));
            return;
        }

        for (int i = 0; i < packets.length; i++) {
            total += packets[i];
            int repack = Integer.highestOneBit(total);
            if(repack > max){
                max = repack;
            }
            int leftover = total - repack;
            total = leftover;
        }

        System.out.println(max);

    }
}
