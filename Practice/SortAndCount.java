import java.util.*;

public class SortAndCount{
    public static void usingMap(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }

    public static void brute(int[] arr){
        Arrays.sort(arr);
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]){
                count++;
            }
            else{
                System.out.println(arr[i-1] + " --> " + count);
                count = 1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,5,4,5,1,2,3,1,2,3,4,4,5};

        usingMap(arr);
        System.out.println();
        brute(arr);
    }
}