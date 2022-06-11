package Arrays;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        //swap(arr,0,5);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int start, int end){
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    //2 pointer approach for reversing an entire list
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
