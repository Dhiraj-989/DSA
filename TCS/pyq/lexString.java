import java.util.*;
public class lexString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		s = s.toLowerCase();

		int[] freq = new int[26];

		for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if( ch >= 'a' && ch <= 'z'){
			    freq[s.charAt(i) - 'a']++;
            }
		}

		for(int i = 0; i<freq.length; i++){
			if(freq[i] > 0){
                System.out.println((char) (i + 'a') + " " + freq[i]);
            }
		}
	}
}