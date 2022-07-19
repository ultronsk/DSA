package Arrays;

import java.util.Arrays;
// Leetcode : https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
public class NUniqueSumToZero {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = new int[n];
        int no = 1;
        if(n%2!=0){
            System.out.println("Odd Number "+n);
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            arr[i]=no;
            arr[i+1]=(-1*no);
            i++;
            no++;
        }
        System.out.println(Arrays.toString(arr));
        }else{
            System.out.println("Even Number "+n);
            for (int i = 0; i < arr.length; i++) {
                arr[i]=no;
                arr[i+1]=(-1*no);
                i++;
                no++;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
