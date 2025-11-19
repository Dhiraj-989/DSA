import java.util.*;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            st.push(s.charAt(i));
        }


        for(int i = 0; i < s.length(); i++){
            int remove = st.pop();
            char ch = s.charAt(i);
            if(remove == ch){
                sb.append(ch);
            }
        }

        return sb.toString();

    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = longestPalindrome(s);
        System.out.println(res);
    }
}
