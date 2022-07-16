package Arrays;
import java.util.Scanner;

public class spiralMatrixII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for N * N matrix ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left=0,right=cols-1;
        int top=0,bottom=rows-1;
        int direction=0;
        int counter =1;

        while(left<=right && top<=bottom){
            if(direction==0){
                for (int i = left; i <= right; i++) {
                    matrix[top][i] = counter;
                    counter++;
                }
                // Change direction
                direction=1;
                //top is visited once so now we need to increment top
                top++;
            }
            else if(direction==1){
                for (int i = top; i <=bottom ; i++) {
                    matrix[i][right] = counter;
                    counter++;
                }
                right--;
                direction=2;
            }
            else if(direction==2){
                for (int i = right; i >=left ; i--) {
                    matrix[bottom][i] = counter;
                    counter++;
                }
                bottom--;
                direction=3;
            }
            else if(direction==3){
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = counter;
                    counter++;
                }
                left++;
                direction=0;
            }
        }
        System.out.println("Final Matrix");
        for (int[] eachRow: matrix) {
            for (int b:eachRow) {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
