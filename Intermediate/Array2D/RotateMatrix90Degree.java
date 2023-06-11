package Intermediate.Array2D;
/*
Given a Matrix[N][N] rotate 90degree clockwise, S.C -> O(1)
 */

public class RotateMatrix90Degree {
    public static void main(String[] args) {
        int[][] A ={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int N = A.length;
        int M = A[0].length;
        System.out.println("Given Array");
        for(int row=0;row<N;row++){
            for(int col=0;col<M;col++) {
                System.out.print(A[row][col]+",");
            }
            System.out.println();
        }
        // first step is to transpose the given matrix
        for(int row=0;row<N;row++){
            for(int col=0;col<M;col++){
                if(row < col){
                    int var = A[row][col];
                    A[row][col] = A[col][row];
                    A[col][row] = var;
                }
            }
        }
        System.out.println("Transpose of matrix");
        for(int row=0;row<N;row++){
            for(int col=0;col<M;col++) {
                System.out.print(A[row][col]+",");
            }
            System.out.println();
        }
        // Second step is to reverse the matrix
        for(int col=0;col<M;col++){
            int x = 0;
            int y = N-1;
            while(x <y){
                int var = A[col][x];
                A[col][x] = A[col][y];
                A[col][y] = var;
                x++;
                y--;
            }
        }
        System.out.println("answer-> 90 degree of the given matrix");
        for(int row=0;row<N;row++){
            for(int col=0;col<M;col++) {
                System.out.print(A[row][col]+",");
            }
            System.out.println();
        }
    }
}
