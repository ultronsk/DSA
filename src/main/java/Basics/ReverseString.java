package Basics;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String :");
        String str = scanner.next();
        reverse(str);
        //reverseInPlace(str);
//        System.out.println("Reverse String is "+ Arrays.toString(reverse(str).));
    }

    // Approach using another another
    private static void reverse(String str){
        int size = str.toCharArray().length;
        char[] rev = new char[size];
        int revSize = rev.length;
        for (int i = size-1; i >= 0; i--) {
            //System.out.print(str.toCharArray()[i]);
            rev[size-1-i] = str.toCharArray()[i];
        }
        //System.out.println(Arrays.toString(rev));
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i]);
        }
    }

    // 2nd Approach os using Inplace - 2 pointer method --> more optimized
    private static void reverseInPlace(String str){
        int left = 0;
        int right = str.length();
        char[] arr = new char[right];
        arr= str.toCharArray();
        Character temp;
        while(left<right){
            temp = arr[left];
            arr[left] = arr[right-1];
            arr[right-1] = temp;
            left++;
            right--;
        }
        //System.out.println(Arrays.toString(arr));
        //System.out.println(Arrays.toString(str));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
