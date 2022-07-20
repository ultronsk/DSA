package Arrays;

import java.util.Arrays;

public class rotateRightArray {
    public static void main(String[] args) {
        int k = 3;
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        // below step is ensuring that we can ignore the unnecessary complete rotation of an array.
        k = k % nums.length;
        //Step 1: Reverse the entire Array
        reverse(nums, 0, nums.length - 1);
        // Step 2 : Reverse the first k numbers
        reverse(nums, 0, k - 1);
        //Step 3 : Reverse the nums.length-k numbers
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        //Swapping values
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
    }
}



//My approach is failing  few test cases
/**
 public static void main(String[] args) {
 int[] nums = {1,2,3,4,5,6,7};
 int k = 13;
 k = k % nums.length;
 System.out.println("nums length is "+nums.length);
 System.out.println("k is "+k);
 //rotateRight(nums,k);
 }
 private static void rotateRight(int[] nums, int k){
 while(k!=0){
 int temp = nums[nums.length-1];
 for (int i=nums.length-1; i>0; i--) {
 nums[i] = nums[i-1];
 }
 nums[0] = temp;
 System.out.println(Arrays.toString(nums));
 k--;
 }}
 **/