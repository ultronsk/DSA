package Arrays;
import java.util.Arrays;
public class Max {
    public static void main(String[] args) {
        int[] arr = {100,3,2,101,900,18};
        //int max = max(arr);
        //System.out.println("Max value in array is "+max);
        int maxInRange = maxInRange(arr,2,4);
        System.out.println("Maximum element in provided range is "+maxInRange);
    }
    private static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max <= arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    private static int maxInRange(int[] arr, int start, int end){
        if(arr.length == 0 || arr == null){
            return -1;
        }
        // Wrong range entered
        if(start > end){
            return -1;
        }

        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}

