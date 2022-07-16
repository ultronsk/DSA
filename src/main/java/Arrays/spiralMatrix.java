package Arrays;

import java.util.ArrayList;
import java.util.List;
//1 2 3
//4 5 6
//7 8 9
/*
1  2  3   4
5  6  7   8
9 10  11  12
13 14 15  16
*/
public class spiralMatrix {
    public static void main(String[] args) {
        //int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> list = new ArrayList();
        list = sMatrix(matrix,list);
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
    }
    private static List<Integer> sMatrix(int[][] matrix,List<Integer> list){
        int row = matrix.length;
        // Including Edge case. 1) If the matrix is empty
        if(row == 0) return list;
        int col = matrix[0].length;

        int l = 0,r=col-1,t=0,b=row-1;
        int d = 0;
        while(l<=r && t<=b){
            if(d==0){
                for (int i = l; i<=r; i++) {
                    list.add(matrix[t][i]);
                }
                //Now we have iterated 0th row so we increment top to be 1.
                t++;
                // After each iteration increase the d++;
                d=1;
            }
            else if(d==1){
                for (int i = t; i<=b; i++) {
                    list.add(matrix[i][r]);
                }
                //Now we have iterated last col so we decrement r--.
                r--;
                // After each iteration increase the d++;
                d=2;
            }
            else if(d==2){
                for (int i = r; i>=l; i--) {
                    list.add(matrix[b][i]);
                }
                //Now we printed reverse last row, so we do b--
                b--;
                // After each iteration increase the d++;
                d=3;
            }
            else if(d==3){
                for (int i = b; i>=t ; i--) {
                    list.add(matrix[i][l]);
                }
                // now we move between rows of 1st column
                l++;
                // After direction is set to be 3 next direction will be 0 again.
                d=0;
            }
        }
        return list;
    }
}
