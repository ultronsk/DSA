package Arrays;

public class HouseRobber {
//    public static void main(String[] args) {
//        int[] nums = {2,1,1,2};
//        rob(nums);
//
//    }
public static void main(String[] args) {
    rob();
}
// DP approach, at each step dp[] contains max value
    private static void rob(){
        //int[] nums = {2,1,1,2};
        int[] nums = {2,7,9,3,1};
        if(nums.length == 0) System.out.println(0);;

        int[] dp = new int[nums.length+1];
        dp[0]=0;
        dp[1]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i+1] = Math.max(dp[i],dp[i-1]+nums[i]);
        }
        System.out.println(dp[nums.length]);
    }
    }





// Not working
//    public static void main(String[] args) {
//        int[] nums = {2,1,1,2};
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum1 = sum1 + nums[i];
//            i++;
//        }
//        for (int i = 1; i < nums.length; i++) {
//            sum2 += nums[i];
//            i++;
//        }
//        int max = (sum1>sum2)?sum1:sum2;
//        System.out.println("max sum is "+max);
//    }
