package Arrays;

public class twoSum {
    public static void main(String[] args) {
//        int[] nums = {3,2,4};
//        int target = 6;
        int[] nums = {2,7,11,15};
        int target = 9;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
