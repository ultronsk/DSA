package Basics;

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int res = num1 + num2;
        System.out.print(num1+" ");
        System.out.print(num2+" ");
        long result = fib(9);
        //System.out.print(res +" ");
        while(res <= 10000){
            res = num1 + num2;
            System.out.print(res+" ");
            num1 = num2;
            num2 = res;
        }

//        for (int i = 1; i <= 9; ++i) {
//            System.out.print(num1 + ", ");
//
//            // compute the next term
//            int nextTerm = num1 + num2;
//            num1 = num2;
//            num2 = nextTerm;
//        }
        System.out.println("Recursion Fib is "+result);
    }

    private static long fib(int num){
        if((num==0) || (num==1)){
            return num;
        }
        else{
            return fib(num-1) + fib(num - 2);
        }
    }
}


// 2 Questions for Fib
//1) Generate first 100 fib numbers?
//2) What is the nth fib value?
