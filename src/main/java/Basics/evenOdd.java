package Basics;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            int no = in.nextInt();
            checkOddEven(no);
        }catch (Exception ex) {
            System.out.println("Exception Occured : "+ex);
        }
    }

    private static void checkOddEven(int number){
        if(number%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
