public class RemoveDigits {
    public static void main(String[] args) {
        String s = "12rhie34";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                sb.append(s.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }
}
