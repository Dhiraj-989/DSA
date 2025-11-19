import java.util.Scanner;

public class CaesarCipher {

    public static String CustomCaesarCipher(int key, String msg){
        String res = "";
        for (int i = 0; i < msg.length(); i++) {
            char ch = msg.charAt(i);

            if( ch >= 'a' && ch <= 'z'){
                if( ch == 'z'){
                    res += 'a';
                }else{
                    res += (char)(ch + key);
                }
            }

            else if( ch >= 'A' && ch <= 'Z'){
                if( ch == 'Z'){
                    res += 'A';
                }else{
                    res += (char)(ch + key);
                }
            }
            else{
                res += ch;
            }
        }
        return res;
    }

    public static String StringBuilder(int key, String text){
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if( ch == ' '){
                res.append(' ');
            }else{
                res.append((char)(ch + key));
            }
        }

        return res.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the plain text: ");
        String text = sc.nextLine();

        System.out.println("Enter the key: ");
        int n = sc.nextInt();

        System.out.println("Using String");
        String res = CustomCaesarCipher(n, text);
        System.out.println(res);

        System.out.println("Using String Builder: ");
        System.out.println(StringBuilder(n, text));


    }
}
