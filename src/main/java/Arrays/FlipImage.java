package Arrays;

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] nums =
        {
            {1,1,0,0},
            {1,0,0,1},
            {0,1,1,1},
            {1,0,1,0}
        };

        //Swapping elements in place
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length/2; j++) {
                int temp = nums[i][j];
                nums[i][j] = nums[i][nums[i].length-1-j];
                nums[i][nums[i].length-1-j] = temp;
            }
        }

        //Invert numbers & print 2D array
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j] == 1){
                    nums[i][j] = 0;
                }else{
                    nums[i][j] = 1;
                }
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

    }
}
