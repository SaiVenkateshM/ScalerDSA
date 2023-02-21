package Advance.Stack;

import java.util.Stack;

public class PassingGame {
    public static void main(String[] args) {
        int A = 10;
        int B = 23;
        int[] C = {86, 63, 60, 0, 47, 0, 99, 9, 0, 0};
        int answer = findPassingGame(A,B,C);
        System.out.println(answer);
    }

    public static int findPassingGame(int A,int B,int[] C){
        Stack<Integer> st = new Stack<>();
        st.push(B);

        for(int i=0;i<=A-1;i++){
            if(C[i] == 0){
                st.pop();
            }
            else{
                st.push(C[i]);
            }
        }
        return st.peek();
    }
}
