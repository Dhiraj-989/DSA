import java.util.Scanner;

public class VowelString {
    public static boolean isVowel(Character ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                return true;
            }
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();


        StringBuilder sb = new StringBuilder();
        int curr = 0;
        int i = 0;

        if(isVowel(s.charAt(i))){
            System.out.println(s + "ay");
        }
        
        for (i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if(isVowel(ch)){
                sb.append(ch);
                break;
            }
        }
        for (int j = i+1; j < s.length(); j++) {
            sb.append(s.charAt(j));
        }
        
        for (curr = 0; curr < i; curr++) {
            sb.append(s.charAt(curr));
        }
        sb.toString();
        System.out.println(sb + "ay");

        System.out.println((char) 65);

    }
}
