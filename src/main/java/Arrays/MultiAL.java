package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialisation
        // internal elements of Parent Arraylist
        System.out.println("Initializing ArrayList ");
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //add elements
        System.out.println("Add elements in ArrayList");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Add elements in ArrayList "+i);
                list.get(i).add(scanner.nextInt());
            }
        }
        System.out.println(list);
    }
}
