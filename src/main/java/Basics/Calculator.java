package Basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st Number");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd Number");
        int num2 = in.nextInt();
        System.out.print("Enter any valid operator +,-,*,/ ");
        char op = in.next().charAt(0);
        switch(op){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                if(num1 > num2){
                    System.out.println(num1 - num2);
                    break;
                }else{
                    System.out.println(num2 - num1);
                    break;
                }
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                if(num1 > num2){
                    System.out.println(num1 / num2);
                    break;
                }else{
                    System.out.println(num2 / num1);
                    break;
                }
            default:
                System.out.println("Please Enter valid Operator");

        }
    }
}
