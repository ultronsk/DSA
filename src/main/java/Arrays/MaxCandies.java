package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxCandies {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        ArrayList<Boolean> list = new ArrayList<>(5);
        int max = candies[0];
        // Find the max element
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]>max){
                max = candies[i];
            }
        }

        System.out.println("Max is "+max);
        //System.out.println(Arrays.toString(candies));

        // Adding value in ArrayList
        for (int i = 0; i < candies.length; i++) {
            candies[i] += extraCandies;
            if(candies[i]>=max){
                list.add(true);
            }else {
                list.add(false);
            }
        }
        for (int i = 0; i < candies.length; i++) {
            System.out.print(list.get(i)+" ");
       }
    }
}
