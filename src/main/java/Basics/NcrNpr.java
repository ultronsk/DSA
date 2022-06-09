package Basics;

import java.util.Scanner;

public class NcrNpr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        System.out.print("Enter r : ");
        int r = scanner.nextInt();
//        System.out.println("Calculate combination (Ncr): ");
//        System.out.println("Calculate Permutation (Npr): ");
        int combination = fact(n)/(fact(r)*fact(n-r));
        int permutation = fact(n)/(fact(n-r));
        System.out.println("Calculate combination (Ncr) : "+combination);
        System.out.println("Calculate Permutation (Npr) : "+permutation);
    }

    private static int fact(int n){
        int res=1;
        for (int i = n; i > 1; i--) {
            res =  res * i;
        }
        return res;
    }
}
