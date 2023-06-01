package Intermediate.Array2D;
/*
Problem Description

Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.
Input Format
Only argument is a 2D array A of size N * N.

Output Format
Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
The vacant spaces in the grid should be assigned to 0.
 */

public class AntiDiganols {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};

        int N = A.length;
        int[][] answer = new int[2*N-1][N];

        for(int row=0;row<2*N-1;row++){// first creating the desired matrix and filling it by 0.
            for(int col=0;col<N; col++){
                answer[row][col] = 0;
            }
        }
        int i=0; int j;// these variable are used for answer matrix to update
        for(int col=0;col<N;col++){// we take col because for anti-diganol and digonal col will remain same and row will change.
            int x=0; // x and y are used for the original matrix to retrieve the anti-digonal values.
            int y = col;
            j=0;
            while(x<N & y>=0){
                answer[i][j] = A[x][y];
                x++;
                y--;
                j++;
            }
            i++;
        }
        for(int row=1;row<N;row++){
            int x = row;
            int y = N-1;
            j=0;
            while(x<N && y>=0){
                answer[i][j] = A[x][y];
                x++;
                y--;
                j++;
            }
            i++;
        }
        //used only to print the matrix.
        for(int row =0;row<2*N-1;row++){
            for(int col=0;col<N;col++){
                System.out.print(answer[row][col]);
            }
            System.out.println();
        }
    }
}

/*
Explaination -> there are 4 variables used in this problem
 */
