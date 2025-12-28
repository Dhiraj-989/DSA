public class Palindrome {
    public static boolean check(String s){
        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "ABABABA";

        int i = 0;
        int j = s.length()- 1;
        boolean isPalindrome = true;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if(isPalindrome){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
        System.out.println(check(s));
    }
}
