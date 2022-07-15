package Arrays;

public class OddValueMatrix {
    public static void main(String[] args) {
        int m=2,n=3;
        int[][] indices = {{0,1},{1,1}};
        int[][] matrix = new int[m][n];
        int[] rows = new int[m];
        int[] cols = new int[n];

        for(int[] a: indices){
            rows[a[0]]++;
            cols[a[1]]++;
        }
        int res =0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if((rows[i] + cols[j]) % 2 !=0){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
/**
// My first Approach
package Arrays;

public class OddMatrixCells {
    public static void main(String[] args) {
        int m=2,n=2;
        int[][] indices = {{1,1},{0,0}};
        int[][] arr = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            int[] rows = indices[i];
            callToManipulate(rows,arr);
        }
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
                if(arr[i][j]%2!=0){
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("Total Odd numbers are "+count);
    }

    private static int[][] callToManipulate(int[] rows,int[][] arr){
        int r = rows[0];
        int c = rows[1];
        for (int i = 0; i < arr[0].length; i++) {
            (arr[r][i])++;
        }

        for (int i = 0; i < arr.length; i++) {
            (arr[i][c])++;
        }
        return arr;
    }
}


//Leetcode Submission
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        for (int i = 0; i < indices.length; i++) {
            int[] rows = indices[i];
            int[][] arr = new int[m][n];
            int r = rows[0];
            int c = rows[1];
            for (int j = 0; j < arr[0].length; j++) {
                (arr[r][j])++;
            }
            for (int k = 0; k < arr.length; k++) {
                (arr[k][c])++;
            }

            for (int l = 0; l < arr.length; l++) {
                for (int z = 0; z < arr[0].length; z++) {
                    if (arr[l][z] % 2 != 0) {
                        count++;
                    }
                }
            }

        }
        return count;
    }
}
**/