package Arrays;

import java.util.Arrays;

public class reshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int matR = mat.length;
        int matC = mat[0].length;
        int r = 1, c = 4;
        int gd = matR * matC;
        int pd = r*c;
        if(gd != pd){
            System.out.println("Return default mat");
        }else{
            System.out.println("put value in new Array ");
        }

        //Edge case
        //If the given new r,c is similar to the exisitng matrix int hat case we simply return the existing matrxi
        if(r==matR && c==matC){
            System.out.println("Return original Matrix here ");
        }

        int new_index =0;
        int old_index =0;
        int[][] newMatrix = new int[r][c];
        while(new_index < r*c && old_index < matR*matC){
            newMatrix[new_index/c][new_index%c] = mat[old_index/matC][old_index%matC];
            new_index++;
            old_index++;
        }

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[0].length; j++) {
                System.out.print(newMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

// Formula
//NOte : FOr Rows Pattern = Position_of_index/column
//For Column pattern = Position_ofIndex% Column