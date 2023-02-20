package ClassRoomQuestions.Stack;

import java.util.*;

public class SortStackInAscendingOrder {
    //Smallest element must be present at the top.
    public static void main(String[] args) {
        Stack<Integer> stackOrg = new Stack<Integer>();
        stackOrg.add(4);
        stackOrg.add(6);
        stackOrg.add(-5);
        stackOrg.add(0);
        stackOrg.add(-1);
        stackOrg.add(2);
        stackOrg.add(5);
        stackOrg.add(3);
        stackOrg.add(1);
        Stack<Integer> tmpStack = sortedStack(stackOrg);
        while (!tmpStack.isEmpty()){
            System.out.println(tmpStack.pop()+" ");
        }
    }

    public static Stack<Integer> sortedStack(Stack<Integer> stackOrg){
        Stack<Integer> auxStack = new Stack<>();
        while (!stackOrg.isEmpty()){
            int temp = stackOrg.pop();
            while (!auxStack.isEmpty() && auxStack.peek() > temp){
                int x = auxStack.peek();
                auxStack.pop();
                stackOrg.push(x);
            }
            auxStack.push(temp);
        }
        while (!auxStack.isEmpty()){
            int x = auxStack.peek();
            auxStack.pop();
            stackOrg.push(x);
        }
        return stackOrg;
    }

}
