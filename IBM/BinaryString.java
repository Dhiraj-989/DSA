/*A binary string needs to be transmitted between two servers.
According to a new network control protocol, data can only be sent in the form of special strings — 
binary strings where no two adjacent characters are the same.

Any data to be transmitted must first be broken into one or more subsequences that follow this rule, 
with each special string sent as a separate data packet.

Your task is to find the minimum number of data packets required to send a given binary string.

Notes

A subsequence is obtained by deleting some characters from the original string while maintaining 
the order of the remaining characters.

A special string must not contain "00" or "11" as adjacent characters.

✅ Example

Input:
00100

Output:
3

Explanation:
The string can be split into three special subsequences:

"0" (first character)

"010" (second, third, and fourth characters)

"0" (last character)

This is the minimum number of subsequences required. */

import java.util.Scanner;

public class BinaryString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int i = 0;
        int count = 0;
        

        for (int j = 1; j < s.length(); j++) {
            if(s.charAt(i) == '0'){
                if(s.charAt(j) == '1'){
                    count++;
                }else{
                    i = j;
                }
            }else{
                if(s.charAt(j) == '0'){
                    count++;
                }
                else{
                    i = j;
                }
            }
        }
        System.out.println(count);
    }
}
