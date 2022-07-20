package Arrays;
//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
public class rotate90DegreeMatrix {
    public static void main(String[] args) {
        //int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
        System.out.println(findRotation(mat,target));
    }

    private static boolean check(int[][] mat, int[][] target){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length ; j++) {
                if(mat[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean findRotation(int[][] mat,int[][] target){
        for (int i = 0; i < 4; i++) {
            if(check(mat,target)){
                return true;
            }
            rotateMatrix(mat);
        }
        return false;
    }

    private static void rotateMatrix(int[][] mat){
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int tmp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = tmp;
            }
        }
        int start =0;
        int end = mat.length-1;
        while(start<=end){
            for (int row = 0; row < mat.length; row++) {
                int tmp = mat[row][start];
                mat[row][start] = mat[row][end];
                mat[row][end] = tmp;
            }
            start++;
            end--;
        }
    }
}
