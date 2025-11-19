/*Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

(*>#): positive integer
(#>*): negative integer
(#=*): 0
Example 1:
Input 1:

###***   -> Value of S
Output :

0   → number of * and # are equal */




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
