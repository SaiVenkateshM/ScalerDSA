package Beginner.Array2D;

public class generateMatrix {
    public class generateMatrix {
        public static void main(String[] args) {
            int A =5;
            int[][] answer = new int[A][A];
            answer = generatedMatrix(A);
        }
        public static int[][] generatedMatrix(int A){
            int count =1;
            int[][] answer = new int[A][A];
            int i;

            int j;
            while(A>0){
                i=0;

                j=0;
                for(int k=1;k<=A;k++){
                    answer[i][j] = count;
                    count++;
                    j++;
                }
                i=0;
                j=A-1;
                for(int k=1;k<=A;k++){
                    answer[i][j] = count;
                    count++;
                    i++;
                }
                i=A-1;
                j=A-1;
                for(int k=1;k<=A;k++){
                    answer[i][j] = count;
                    count++;
                    j--;
                }
                i=A-1;
                j=0;
                for(int k=1;k<=A;k++){
                    answer[i][j] = count;
                    count++;
                    i--;
                }
                if(A == 1){
                    answer[i][j] = count;
                }
            }
            return answer;
        }
    }
}
