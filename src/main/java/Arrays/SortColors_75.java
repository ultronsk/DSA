package Arrays;

import java.util.Arrays;

public class SortColors_75 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]> nums[j]){
                    int temp;
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
