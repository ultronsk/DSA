package Arrays;

import java.util.Arrays;
// This is O(n*n) Time complexity
public class ProductOfArrayExceptSelf_238 {
    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};
                //{1,2,3,4};
        //approach1(arr);
        //System.out.println(Arrays.toString(approach2(arr)));
        System.out.println(Arrays.toString(approach3(arr)));

    }

    static void approach1(int[] arr){

        int[] answer = new int[arr.length];
        System.out.println(answer.length);
        for (int i = 0; i < arr.length; i++) {
            int res = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    res = res * arr[j];
                }
            }
            answer[i] = res;
        }
        System.out.println(Arrays.toString(answer));
    }

    // Trying to solve in O(n) time complexity using left & right pass approach
    static int[] approach2(int[] nums){
        //Edge Case
        if(nums == null || nums.length == 0) return new int[0];
        
        int[] result = new int[nums.length];
        
        int rp = 1;
        //Left pass
        for (int i = 0; i < nums.length; i++) {
            result[i] = rp;
            rp = rp * nums[i];
        }

        rp = 1;

        //Right Pass
        for (int i = nums.length-1; i >= 0; i--) {
            result[i] = result[i] * rp;
            rp = rp * nums[i];
        }
return result;
    }

    static int[] approach3(int[] arr){
        int[] ans = new int[arr.length];
        int pre=1;

        //Calculation for left
        for (int i = 0; i < arr.length; i++) {
            ans[i] = pre;
            pre = pre * arr[i];
        }

        //Calculation for right
        pre= 1;
        for (int i = arr.length-1; i >= 0; i--) {
            ans[i] = ans[i] * pre;
            pre = pre * arr[i];
        }
        return ans;
    }
}
