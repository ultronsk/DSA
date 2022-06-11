package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StringMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 3 best Friends Name ");
        String[] arr = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter "+(i+1)+" Friend Name : ");
            arr[i] = scanner.nextLine();
        }

        //System.out.print(Arrays.toString(arr));

        for(String element : arr){
            System.out.println(element);
        }
    }
}
