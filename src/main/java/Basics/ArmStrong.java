package Basics;

import java.util.ArrayList;
import java.util.Scanner;
// Print all ArmStrong numbers less than 1000
public class ArmStrong {
    public static void main(String[] args) {
        //System.out.print("Enter a number:");
        //Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        //int no = in.nextInt();
        for (int i = 0; i < 1000; i++) {
            Boolean status =  armStrong(i);
            if(status == true){
                list.add(i);
            }
        }
        System.out.println("Total elements in list are "+list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private static Boolean armStrong(int no){
        int input = no;
        int rem= 0;
        int res = 0;
        while(no > 0){
            rem = no % 10;
            no = no / 10;
            res = (rem * rem * rem) + res;
        }
        if(input == res){
            //System.out.println("ArmStrong number "+input);
            return true;
        }else{
            //System.out.println("Not armstrong Number "+input);
            return false;
        }
    }
}
