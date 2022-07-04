package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HigestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int max = 0;
        int[] target = new int[gain.length+1];
        target[0] = 0;
        for (int i = 0; i < target.length-1; i++) {
            target[i+1] = gain[i] + target[i];
            if(max < target[i+1]){
                max = target[i+1];
            }
        }
        System.out.println("Max is "+max);
        System.out.println(Arrays.toString(target));
    }
}
