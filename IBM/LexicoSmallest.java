public class LexicoSmallest {
    public static String smallest(String s ){
        char[] charArr = s.toCharArray();
        int n = charArr.length;

        int i = 0;
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
