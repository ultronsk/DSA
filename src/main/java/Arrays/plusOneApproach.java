package Arrays;
import java.util.Arrays;

public class plusOneApproach {
    public static void main(String[] args) {
        int[] digits = {8,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
        }
//        System.out.println(Arrays.toString(callTOFunction()));

    private static int[] plusOne(int[] digits) {
        int index = digits.length-1;
        while(index>=0){
            if(digits[index]==9) {
                digits[index] = 0;
            }   else{
                digits[index] += 1;
                return digits;
            }
            index--;
        }
        int[] result = new int[digits.length+1];
        return result;
    }
    }

/**
 * NOTES :
 * 1) If the last digit of an array is not 9 then simply add 1 to it & return the array.
 * 2) If the last value of array is 9 then assign 0 to the same value of your current index value & start decrementing at each loop value & also create new array of size oldArray + 1 length if the left most value is 9.
 * **/


/**
 *
 * //This is old Approach stuck while returnig array.
    private static int[] callTOFunction(){
        int[] digits = {8,9,9,9};
        int len = digits.length-1;
        int[] newArray = new int[digits.length+1];
        if(len == 0){
            System.out.println("digits array is empty.");
        }
        System.out.println("Length of digits Array is "+len);
        if(digits[len]<9){
            System.out.println("Last digit of digit array is "+digits[len]);
            digits[len]++;
        }else{
            //2 Cases
            //1) Carry will forward till in between digits
            //2) if carry will forward from another lsb & if the most left bit is 10 then we need to create another array with one more size than originalarray size
            // Choice we can also use ArrayList but lets solve this question with array only.
            for (int i = len; i > 0; i--) {
                digits[i]=0;
                digits[i-1]=digits[i-1]+1;
                return digits;
            }
            int newCount=0;
            if(digits[0]>9){
                newArray[0]=1;
                newArray[1]=0;
                for (int i = 1; i < digits.length; i++) {
                    newArray[i+1]=digits[i];
                }
                //System.out.println("newArray : "+Arrays.toString(newArray));
            }
            return newArray;
        }
        System.out.println("Digits Array : "+Arrays.toString(digits));
        System.out.println("newArray : "+Arrays.toString(newArray));

    }
**/




