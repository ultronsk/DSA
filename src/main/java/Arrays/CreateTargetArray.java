package Arrays;
import java.util.Arrays;
public class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(index[i] < i){
            shiftRightBy1(target,index[i]);
            target[index[i]] = nums[i];
            }
            else {
                target[index[i]] = nums[i];
            }
    }
        System.out.println(Arrays.toString(target));
}

private static int[] shiftRightBy1(int[] temp,int index){
    for (int i = temp.length-1; i > index; i--) {
        temp[i] = temp[i-1];
    }
        return temp;
    }
}