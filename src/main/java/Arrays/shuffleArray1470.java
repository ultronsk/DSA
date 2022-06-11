package Arrays;

import java.util.Arrays;

public class shuffleArray1470 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n=4;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(i%2!=0){
            res[i] = nums[n+(i/2)];
        }else {
                res[i] = nums[i/2];
            }
        }
        System.out.println(Arrays.toString(res));
    }
}

// Output:[1,4,2,3,3,2,4,1]