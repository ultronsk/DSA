package Arrays;

public class Transposematrix {
    public static void main(String[] args) {
        //NOTE : 2 approaches to solve this
        //1. In place swapping but failing when matrix is n * m size (where row != column)
//-----> Best Working 2) Via creating new matrix if n * m size (where row != column)
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] result = new int[columns][rows];
        System.out.println("Row " + rows + " columns " + columns);
        System.out.println("Original transposing matrix is ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        System.out.println("After transposing new matrix is ");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}