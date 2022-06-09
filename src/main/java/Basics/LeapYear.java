package Basics;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter Year : ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean leap = false;
        if(year % 4 == 0){

            //if the year is a century
            if(year % 100 == 0 ){
                // if the year is divided by 400
                //then it is a leap year
                if(year % 400 == 0){
                    leap = true;
                }
                else{
                    leap = false;
                }
            }

            // if the year is not century
            else
                leap = true;
        }
        else
            leap = false;
        if(leap){
            System.out.println("LEAP YEAR "+year);
        }else{
            System.out.println("NOT A LEAP YEAR "+year);
        }
    }
}
