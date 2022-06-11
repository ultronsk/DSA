package Arrays;

import java.util.Arrays;

public class FirstLastTargetPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,7,7,8,8,10};
        int[] ans = new int[2];
        int target = 6;
        int start=-1, end = -1;
        ans[0] = start;
        ans[1]= end;
        System.out.println(Arrays.toString(startEndPosition(nums,ans,target)));

    }

    private static int[] startEndPosition(int[] nums,int[] ans,int target){
        if(nums.length == 0 || nums[0] > target){
            return ans;
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                if(ans[0] == -1){
                ans[0] = i;
            }
            ans[1]= i;}

        }
        return ans;
    }
}
