package Basics;

public class Palindrome {
    public static void main(String[] args) {
        int num = 12345;
        int reverse = reverse(num);
        if(num == reverse){
            System.out.println("reverse "+reverse);
            System.out.println("Palindrome");
        }else{
            System.out.println("reverse "+reverse);
            System.out.println("not a Palindrome");
        }
    }
    private static int reverse(int num){
        int rem;
        int res = 0;
        int counter =0;
        int original = num;
        for (int j = 0; original > 10; j++) {
            original = original /10; //---> 12345,1234,123,12,1
            counter++;
        }
        System.out.println("Total value of counter "+counter);
        for (int j = 0; num > 0; j++) {
            rem = num % 10; //--> 5,4,3,2,1,0
            num = num /10; //---> 12345,1234,123,12,1
            res = (int)(res + rem * Math.pow(10,counter));
            counter--;
        }
        return res;
    }
}
