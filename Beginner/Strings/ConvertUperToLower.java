package Beginner.Strings;

public class ConvertUperToLower {
    public static void main(String[] args) {
        String A ="INTERVIEWBIT";
        String ans = funUpperToLower(A);
        System.out.println(ans);
    }
    public static String funUpperToLower(String A){
        String lowerCase="";
        for(int i=0;i<A.length();i++){
            char ch = A.charAt(i);
            int numValue = (int) ch + 32;

            char finalChar = (char) numValue;
            lowerCase += finalChar;
        }

        return lowerCase;
    }
}
