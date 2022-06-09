package Basics;

import java.util.Scanner;

// print the sum of first N natural numbers
public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first "+n+" natural numbers are "+sum);
    }
}
