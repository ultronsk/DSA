package Arrays;

public class setMatrixZeros {
public static void main(String[] args) {
    int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
    setZeroes(matrix);
}

    private static void setZeroes(int[][] matrix) {
        int col0 = 1, rows = matrix.length, cols = matrix[0].length;

        // Setting 0th row & col values to 0.
        // Also checking 0 in the first column of all rows
        for(int i = 0; i < rows; i++){
            if(matrix[i][0] == 0) col0 = 0;
            for(int j = 1; j < cols; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        // Reverse checking for setting fields to zero
        for(int i = rows-1; i >= 0; i--){
            for(int j = cols-1; j >= 1; j--){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
            // Checking & making all rows to 0 if it satisfies below mentioned condition.
            if(col0 == 0){
                matrix[i][0] = 0;
            }
        }
        //iterating a matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}


//NOTES Instead of taking two dummy arrays we can use the first row and column of the matrix for the same work. This will help to reduce the space complexity of the problem. While traversing for the second time the first row and column will be computed first, which will affect the values of further elements that’s why we traversing in the reverse direction.
//
//Instead of taking two separate dummy array,take first row and column of the matrix as the array for checking whether the particular column or row has the value 0 or not.Since matrix[0][0] are overlapping.Therefore take separate variable col0(say) to check if the 0th column has 0 or not and use matrix[0][0] to check if the 0th row has 0 or not.Now traverse from last element to the first element and check if matrix[i][0]==0 || matrix[0][j]==0 and if true set matrix[i][j]=0,else continue.
//Time Complexity - O(n * m) Space Complexity - O(1)