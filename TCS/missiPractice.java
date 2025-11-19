import java.util.*;

public class missiPractice{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		HashMap<Character, Integer> firstIdx = new HashMap<>();

		for(int i = 0; i < s.length(); i++){
			if(map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), map.get(s.charAt(i) + 1));
			}else{
				map.put(s.charAt(i), 1);
			}

			
			if(!firstIdx.containsKey(s.charAt(i))){
				map.put(s.charAt(i), 1);
			}
		}

		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			char ch = entry.getKey();
			int count = entry.getValue();
			int idx = firstIdx.get(ch) + 1;

			System.out.println(ch + " -> " + count + " times, first occurrence at index " + idx);
		}


		int max = Collections.max(map.values());
		ArrayList<Character> list = new ArrayList<>();
		for( char ch : map.keySet()){
			if(map.get(ch) == max){
				list.add(ch);
			}
		}

		System.out.println("Most Repeated character: " + list.get(0));

		for( char ch : map.keySet()){
			if(map.get(ch) == 1){
				System.out.println("First Non- Repeating character: " + ch);
			}
		}
	}
}
		

		









