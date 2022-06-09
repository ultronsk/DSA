package Basics;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scanner.nextInt();
        int i=1;
        while(i<=(n/2)){
            if(n%i==0){
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println(n+" ");
    }
}
