import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Missisippi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        HashMap<Character, Integer> map = new LinkedHashMap<>();
        HashMap<Character, Integer> index = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i), 1);
            }

            if(!index.containsKey(s.charAt(i))){
                index.put(s.charAt(i), i);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            char ch = entry.getKey();
            int count = entry.getValue();
            int idx = index.get(ch) + 1;
            System.out.println(ch + " -> " + count + " times, first occurrence at index " + idx);
        }
        
        int max = Collections.max(map.values());
        ArrayList<Character> mostRepeated = new ArrayList<>();
        for (char ch : map.keySet()) {
            if( map.get(ch) == max){
                mostRepeated.add(ch);
            }     
        }

        Character firstNonRepeat = null;
        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                firstNonRepeat = ch;
                break;
            }
        }

        if (firstNonRepeat == null) {
            System.out.println("First Non-Repeating Character: None");
            System.out.println("First Repeating Character: " + mostRepeated.get(0));
        } else {
            System.out.println("Most Repeated Character: " + mostRepeated.get(0) + " (appears " + max + " times)");
            System.out.println("First Non-Repeating Character: " + firstNonRepeat);
        }
    }
        

    }
