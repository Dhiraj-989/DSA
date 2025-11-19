/* pyq 2023 day 1 */
import java.util.ArrayList;
import java.util.Scanner;

public class StringConversion {
    public static int result(String A, String B){
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();

        for (int i = 0; i < b.length; i++) {
            if(a[i] < b[i]){
                return -1;
            }
        }

        int count = 0;

        for(char ch = 'a'; ch <= 'z'; ch++){
            ArrayList<Integer> needChange = new ArrayList<>();
            for (int i = 0; i < a.length; i++) {
                if( b[i] == ch && a[i] > ch){
                    needChange.add(i);
                }
            }

            if(needChange.isEmpty()){
                continue;
            }

            boolean found = false;
            for (int i = 0; i < a.length; i++) {
                if(a[i] == ch){
                    found = true;
                    break;
                }
            }
            if(!found){
                return -1;
            }

            for( int idx : needChange){
                a[idx] = ch;
            }
            count++;
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String A = sc.next();
        String B = sc.next();

        System.out.println(result(A, B));
    }
}
