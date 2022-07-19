package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AddArrayFormInteger {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int n = num.length;
        int k=34;
        int carry=0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = n-1; i >=0 ; i--) {
            num[i] = num[i] + k%10 + carry;
            list.add(num[i]%10);
            k = k/10;
            carry = num[i]/10;
        }
        k = k+carry;
        while(k!=0){
            list.add(k%10);
            k=k/10;
        }
        System.out.println(carry);
        Collections.reverse(list);
        System.out.println("List is "+list);

    }
}






