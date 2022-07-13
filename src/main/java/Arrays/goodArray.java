package Arrays;

public class goodArray {
        public static void main(String[] args) {
            int[] nums = {7,23,12,5};
            System.out.println(isGoodArray(nums));
        }

        private static boolean isGoodArray(int[] nums) {
            //Including Edge cases
            //1) If there is only one element in an array & it contains 1 as a value
            if (nums.length == 1 && nums[0] == 1)
                return true;

            int gcd = nums[0];
            for (int i = 1; i < nums.length; i++) {
                int a = (nums[i] > gcd) ? nums[i] : gcd;
                int b = (nums[i] < gcd) ? nums[i] : gcd;
                int rem = b;
                while (a % b != 0) {
                    rem = a % b;
                    a = b;
                    b = rem;
                }
                gcd = rem;
                if (gcd == 1) {
                    return true;
                }
            }
            return false;
        }
    }

//    public static void main(String[] args) {
//        //int[] nums = {12,5,7,23};
//        int[] nums = {3,6};
//        int a = nums[0];
//        int g =0;
//        for (int i = 0; i < nums.length; i++) {
//            g = gcd(a,nums[i]);
//        }
//        if(g == 1){
//            System.out.println("True");
//        }else {
//            System.out.println("False");
//        }
//    }
//
//    private static int gcd(int a, int b){
//        int ans = 0;
//        for (int i = 1; i < a; i++) {
//            if(a%i==0&&b%i==0){
//                ans = i;
//            }
//            //ans = 0;
//        }
//        return ans;
//    }
//}
