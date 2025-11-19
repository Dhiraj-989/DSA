
import java.util.*;

public class ReverseAnArray{

    // public static void reverse(int[] nums, int start, int end){
    //     while(start < end){
    //     int temp = nums[start];
    //     nums[start] = nums[end];
    //     nums[end] = temp;
    //     start++;
    //     end--;
    //     }

    // }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        reverse(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void reverse(int[] nums, int start, int end){
        if(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            reverse(nums, start + 1, end - 1);
        }
        
    }

    
}