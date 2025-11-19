import java.util.*;
public class Missisipi{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		HashMap<Character, Integer> firstIdx = new HashMap<>();

		for(int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch) + 1);
			}else{
				map.put(ch, 1);
			}

			if(!firstIdx.containsKey(ch)){
				firstIdx.put(ch, i);
		}
    }

		char mostRep = '\0';
		int max = 0;

		for(char ch : map.keySet()){
			if(map.get(ch) > max){
				max = map.get(ch);
				mostRep = ch;
			}else if(map.get(ch) == max){
				if(firstIdx.get(ch) < firstIdx.get(mostRep)){
					mostRep = ch;
				}
			}
		}

		char nonRep = '\0';
		for(int i = 0; i < s.length(); i++){
			if(map.get(s.charAt(i)) == 1){
				nonRep = s.charAt(i);
				break;
			}
		}

		if(nonRep == '\0'){
			System.out.println("None " + mostRep);
		}else{
			System.out.println("Most Repeated Character: " + mostRep + " (" + max + " times)");
           	System.out.println("First Non-Repeating Character: " + nonRep);
		}
	}
}





		

				
		