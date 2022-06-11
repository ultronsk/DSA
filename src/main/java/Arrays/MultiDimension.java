package Arrays;
// 2D Array

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
         */

        /*
        {
            {1, 2, 3}, //0th Index
            {4, 5},//1st Index
            {7, 8, 9, 10} // 2nd index
        }
         */

        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][3];

        // Taking Input
        System.out.println("Taking Input : ");
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print("Enter input for row "+row+" & column "+col+" : ");
                arr[row][col] = scanner.nextInt();
            }
            System.out.println();
        }

        // Printing 2D Array
        for (int row = 0; row < arr.length; row++) { // visiting each row
            for (int col = 0; col < arr[row].length; col++) { // visiting each column of selected row
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();// NewLine after each row completion
        }

        // Foreach loop
        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
