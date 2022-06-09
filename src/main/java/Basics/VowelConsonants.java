package Basics;

import java.util.Scanner;

public class VowelConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character :");
        char n = scanner.next().toLowerCase().charAt(0);
        if (Character.toString(n).matches("[a-z]")) {
            if (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u') {
                System.out.println(n + " is a vowel.");
            } else {
                System.out.println(n + " is a consonant.");
            }
        }else{
            System.out.println(n+" is not a valid character.");
        }
    }
}
