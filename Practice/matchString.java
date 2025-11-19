public class matchString {

    public static void match(String str){
        int count1 = 0;
        int count2 = 0;
        for(char c : str.toCharArray()){
            if(c == '*'){
                count1++;
            }
            if( c == '#'){
                count2++;
            }
        }
        System.out.println(count1 - count2);
        
    }
    public static void main(String[] args){
        String str = "#*#*##";
        match(str);
    }



}
