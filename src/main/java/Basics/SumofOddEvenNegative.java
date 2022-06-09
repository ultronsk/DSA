package Basics;

import java.util.Scanner;

public class SumofOddEvenNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neg = 0;
        int odd = 0;
        int even = 0;

        while(true) {
            System.out.println("Enter a number or 0 to quit : ");
            int n = scanner.nextInt();
            if(n==0){
                break;
            }
                if (n < 0) {
                    neg += n;
                } else {
                    if (n % 2 == 0) {
                        even += n;
                    } else {
                        odd += n;
                    }
                }
            }
        System.out.println("-ve numbers sum are "+neg+" +ve Even Sum are "+even+" +ve Odd Sum are "+odd);
    }
}
