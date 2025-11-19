

public class CountFreq {

    //brute force, visited array
    public static void count(int[] nums){
        int n = nums.length;
        boolean[] visited = new boolean[n];

        
        for(int i = 0; i < n; i++){
            if(visited[i]){
                continue;
            }

            int count = 1;
            for(int j = i+1; j < n; j++){
                if(nums[i] == nums[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(nums[i] + " -> " + count);
        }
    }

    // public static void count(int[] nums){
    //     int n = nums.length;

    //     HashMap<Integer, Integer> map = new HashMap<>();

    //     for(int num : nums){
    //         if(map.containsKey(num)){
    //             map.put(num, map.get(num) + 1);
    //         }else{
    //             map.put(num, 1);
    //         }
    //     }
    //     for(Map.Entry<Integer, Integer> entry : map.entrySet()){
    //         System.out.println(entry.getKey() + " -> " + entry.getValue());
    //     }

    // }
    public static void main(String[] args) {
        int[] nums = {1,2,10,40,10,20,20,2,1};
        count(nums);
    }
}
