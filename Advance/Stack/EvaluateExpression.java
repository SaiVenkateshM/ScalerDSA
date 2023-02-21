package Advance.Stack;

import java.util.Stack;
/*
An arithmetic expression is given by a string array A of size N. Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each string may be an integer or an operator.
Input 1:
    A =   ["2", "1", "+", "3", "*"]
Input 2:
    A = ["4", "13", "5", "/", "+"]
 */
public class EvaluateExpression {
    public static void main(String[] args) {
        String[] A = {"5", "1", "2", "+", "4", "*", "+", "3", "-"};
        int answer = findEvaluateExpression(A);
        System.out.println(answer);
    }
    public static int findEvaluateExpression(String[] A){
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<A.length;i++){
            if(A[i].equals("*")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a*b);
            }
            else if(A[i].equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a-b);
            }
            else if(A[i].equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a+b);
            }
            else if(A[i].equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }
            else{
                stack.push(Integer.parseInt(A[i]));
            }
        }
        return stack.pop();
    }
}
