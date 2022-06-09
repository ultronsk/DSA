package Basics;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2 = scanner.nextInt();
        //LCM(n1,n2);
        LCM2(n1,n2);
    }

    // Method LCM is not working i need t troubleshoot
    private static void LCM(int n1, int n2){
        int i =2;
        int res = 1;
        while(n1!=1 || n2!=1){
            while (n1%i==0 || n2%i==0){
                    n1 = n1/i;
                    n2 = n2/i;
                    res= res * i;

            }
            i++;
        }
        System.out.println("Final Res is "+res);
    }

    private static void LCM2(int n1, int n2){
        int lcm;
        lcm = (n1 > n2) ? n1 : n2;


        while(true){
            if(lcm % n1 == 0 && lcm % n2 == 0){
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
            }
            lcm++;
        }
    }
}
