/*Given a string that consists of lowercase English letters, select exactly one non-empty
substring of the string and replace each character of that substring with the previous 
character of the English alphabet.

Examples of conversion:

'b' → 'a'

'c' → 'b'

…

'a' → 'z'

Your task is to return the lexicographically smallest string possible after performing this
operation exactly once.

Input:  s = "hackerrank"
Output: "gackerrank"
Explanation:
Choose substring "h" and replace 'h' → 'g'.
*/

public class LexicoSmallest {
    public static String smallest(String s ){
        char[] charArr = s.toCharArray();
        int n = charArr.length;

        int i                     = 0;
        while(i < n && charArr[i] == 'a'){
            i++;
        }

        if(i == n){
            charArr[n-1] = 'z';
            return new String(charArr);
        }

        while(i < n && charArr[i] != 'a'){
            charArr[i] = (char) (charArr[i] - 1);
            i++;
        }

        return new String(charArr);

    }
    public static void main(String[] args) {
        String s = "aaaa";
        System.out.println(smallest(s));

    }
}
