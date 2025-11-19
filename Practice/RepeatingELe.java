
import java.util.HashMap;
import java.util.Map;


public class RepeatingELe{

    public static void bruteSol(int[] arr, int n){
        int count = 0;
        int[] dup = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]){
                    dup[count++] = arr[i];
                }
            }
        }

        System.out.println("The duplicate elements are: ");
        System.out.println("Brute Force" );
        
        

        for (int i = 0; i < count; i++) {
            boolean printed = false;
            for (int j = 0; j < i; j++) {
                if( dup[i] == dup[j]){
                    printed = true;
                    break;
                }
            }
            if(!printed){
                System.out.print(dup[i] + " ");
            }  

            }
            System.out.println();
        }


        public static void HashMap(int[] arr, int n){
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < arr.length; i++) {
                int val = arr[i];

                if(map.containsKey(val)){
                    map.put(val, map.get(val) + 1);
                }else{
                    map.put(val, 1);

                }
            }

            for (Map.Entry<Integer, Integer> en : map.entrySet()) {
                
                Integer val = en.getValue();
                if( val > 1){
                    System.out.print(en.getKey() + " ");
                }
                
            }
        }

    
    public static void main(String[] args) {
        int[] arr = {1,1,4,5,6,7,4,4,4,5,3};
        int n = arr.length;

        bruteSol(arr, n);
        System.out.println("Hashmap: ");
        HashMap(arr, n);
        

    }
}