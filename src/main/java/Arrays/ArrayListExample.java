package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);


        // List Opearation

        // 1) Add Element in a list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(6);

        //2) Print elements of a list
        System.out.println(list);

        //3) Contains function of list to search an element
        System.out.println(list.contains(4));

        //4) Update existing element on the basis of index position
        list.set(6,7);
        System.out.println(list);

        // 5) remove an element from list
        list.remove(2);// It will remove value 3 from list
        System.out.println(list);

        // Taking input from user
        System.out.println("Enter 5 elements in a list");
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
        }

        //Get item at any index
        System.out.println("Printing all the elements in a list");
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}
