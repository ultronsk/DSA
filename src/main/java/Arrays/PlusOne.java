package Arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9,8,9};
        int num = 0;
        int[] result = One(digits);
        System.out.println(Arrays.toString(result));
    }

    private static int[] One(int[] digits){
        for (int i = digits.length-1; i >=0 ; i--) {
            // Here we know that the digit which are less than 9 when added with 1 always result < 10, so here return from here.
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
        }
        // creating new array of size(lastArray.length+1)
        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;
    }
}
