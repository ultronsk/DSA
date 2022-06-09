package Basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number for factorial :");
        int n = scanner.nextInt();
        int res = fact(n);
        System.out.println("Factorial of "+n+" is "+res);
    }
    private static int fact(int n){
        int res=1;
        for (int i = n; i > 1; i--) {
            res =  res * i;
        }
        return res;
    }
}
