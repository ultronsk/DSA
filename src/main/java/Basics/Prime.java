package Basics;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        System.out.print("Enter a number to check if it's prime or not!");
        Scanner input = new Scanner(System.in);
        int no = input.nextInt();
        if(no <= 1) {
            System.out.println("Neither prime nor composite number ");
            return;
        }
        //primeNumber(no);
        printPrimeSeries(no);
    }


    // Enter a single number to check if its prime or not
    private static void primeNumber(int number){
        int counter =0;
        for(int i = 2;i<=number/2;i++){
            //System.out.println("value of i is "+i);
            if(number%i==0){
                counter++;
            }
        }
        if(counter>=1){
            //System.out.println(+number+" is not a Prime number.");
        }else{
            System.out.println(+number+" is  a Prime number.");
        }
    }

    // Print Series of prime number
    private static void printPrimeSeries(int number){
        int start = 2;
        while(start != number){
            primeNumber(start);
            start++;
        }
    }
}
