import java.util.Arrays;
import java.util.Scanner;

public class IncDecArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length/2; i++) {
            System.out.print(nums[i]);
        }

        for (int i = nums.length - 1; i >= nums.length/2  ; i--) {
            System.out.print(nums[i]);
        }
    }
}
