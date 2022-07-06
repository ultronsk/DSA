package Arrays;

public class matricDiagonalSum {
    public static void main(String[] args) {
        //int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int res = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i==j){
                    res = mat[i][j] + res;
                }
            }
        }
        for (int i = 0; i < mat.length ; i++) {
           for (int j = mat[i].length-i-1; j >= 0; j--) {
                if(i!=j) {
                    res = mat[i][j] + res;
                    break;
                }
                break;
            }
        }
        System.out.println("res is "+res);
    }
}
