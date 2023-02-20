package ClassRoomQuestions.Stack;

import java.util.Stack;

public class DoubleCharacterTrouble {
    public static void main(String[] args) {
        String doubleCharacterString ="abccbc";
        String answer = removeDoubleCharString(doubleCharacterString);
        System.out.println(answer);
    }
    public static String removeDoubleCharString(String givenString){
        Stack<Character> origStack = new Stack<>();

        for(int i=0;i<givenString.length();i++){
            char ch = givenString.charAt(i);
            if(!origStack.isEmpty() && origStack.peek() == ch){

                origStack.pop();
            }
            else{
                origStack.push(ch);
            }
        }
        String answer =reverseStack(origStack);
        return answer;
    }
    public static String reverseStack(Stack<Character> origStack){
        Stack<Character> auxStack = new Stack<>();
        String ans ="";
       while (!origStack.isEmpty()){
           char temp = origStack.pop();
           auxStack.push(temp);
       }
       while (!auxStack.isEmpty()){
           char ca = auxStack.pop();
           ans +=String.valueOf(ca);
       }
       return ans;
    }
}
