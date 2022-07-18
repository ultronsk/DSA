package Arrays;
import java.util.Arrays;
public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        //int[] nums ={0,0,1,1,1,2,2,3,3,4,4};
        int[] nums = {1,1,2,2};
        if(nums.length==0){
            System.out.println("array is empty");
        }

        int i=0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        System.out.println(i+1);
    }
}