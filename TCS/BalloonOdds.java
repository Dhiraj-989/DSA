/*At a fun fair, a street vendor is selling different colours of balloons. He sells N number of different colours of balloons (B[]). The task is to find the colour (odd) of the balloon which is present odd number of times in the bunch of balloons.

Note: If there is more than one colour which is odd in number, then the first colour in the array which is present odd number of times is displayed. The colours of the balloons can all be either upper case or lower case in the array. If all the inputs are even in number, display the message “All are even”.

Example 1:

7  -> Value of N
[r,g,b,b,g,y,y]  -> B[] Elements B[0] to B[N-1], where each input element is sepārated by ṉew line.
Output :

r -> [r,g,b,b,g,y,y]  -> “r” colour balloon is present odd number of times in the bunch. */

import java.util.Scanner;

public class BalloonOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of balloons: ");
        int n = sc.nextInt();

        System.out.println("Colour of balloons: ");
        char[] color = new char[n];

        for (int i = 0; i < n; i++) {
            color[i] = sc.next().charAt(0);
        }

        //USING FREQ ARRAY
        int[] freq = new int[256];

        for (int i = 0; i < n; i++) {
            freq[color[i]]++;
        }

        boolean found = false;
        for (int i = 0; i < freq.length; i++) {
            if(freq[color[i]] % 2 != 0 ){
                System.out.println(color[i]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("all are even");
        }


        // //USING HASHMAP
        // HashMap<Character, Integer> map = new HashMap<>();

        // for (int i = 0; i < n; i++) {
        //     char key = color[i];
        //     if(map.containsKey(key)){
        //         map.put(key, map.get(key) + 1 );
        //     }
        //     else{
        //         map.put(key, 1);
        //     }
        // }

        // boolean found = false;
        // for (int i = 0; i < n; i++) {
        //     if(map.get(color[i]) % 2 != 0){
        //         System.out.println(color[i]);
        //         found = true;
        //         break;
        //     }
        // }
        // if(!found){
        //     System.out.println("all are even");
        // }

    }
}
