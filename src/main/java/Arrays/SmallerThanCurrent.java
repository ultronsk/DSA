package Arrays;

import java.util.Arrays;

public class SmallerThanCurrent {

    public static void main(String[] args) {
        int[] nums = {6,5,4,8};
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int counter=0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]>nums[j]){
                    counter++;
                }
                res[i]=counter;
            }
        }
        System.out.println(Arrays.toString(res));
    }



}
