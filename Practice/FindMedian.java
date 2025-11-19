
import java.util.Arrays;

public class FindMedian {

    public static void median(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;

        if(n % 2 == 0){
            int mid = n/2;
            double median = (nums[mid] + nums[mid-1])/2.0;
            System.out.println(median);
        }else{
            int mid = (n / 2 );
            int median = nums[mid];
            
            System.out.println(median);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        median(nums);
    }
}
