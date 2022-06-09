package Basics;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
        int n2 = scanner.nextInt();
        HCF(n1,n2);
    }
    private static void HCF(int n1, int n2){
        if(n1 < 0 || n2 < 0){
            System.out.println("Enter valid input");
        }
            int hcf = 1;
        for (int i = 1; i <= n1 || i <= n2; i++) {
            if(n1 % i == 0 && n2 % i == 0){
                hcf = i;
            }
        }
        System.out.println("HCF is "+hcf);
    }
}
