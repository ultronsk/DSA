package Basics;

import com.sun.deploy.security.CredentialManager;

import java.util.Scanner;

public class ProductSumDigitDiff_1281 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = scanner.nextInt();
        int diff = ProdAddi(num);
        System.out.println("Difference is "+diff);
    }
    private static int ProdAddi(int num){
        int prod=1;
        int addi=0;
        for (int i = 0; num > 0 ; i++) {
            int rem = num % 10;
            num = num /10;
            prod = prod * rem;
            addi = addi + rem;
        }
        int res = prod - addi;
        return res;
    }
}
