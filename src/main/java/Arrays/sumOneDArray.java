package Arrays;

import java.util.Arrays;

public class sumOneDArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + sum;
            sum = nums[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
