package Advance.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class firstMissingInteger {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-8, -7, -6));
        int answer = findFirstMissingInteger(A);
        System.out.println(answer);
    }

    public static int findFirstMissingInteger(ArrayList<Integer> A){

        int n = A.size();

        for(int i=0;i<n;i++){
            if(A.get(i) >0 && A.get(i) <= n && A.get(i) != i+1){
                int val = A.get(i);
                if(A.get(i) == A.get(val-1))
                    break;
                //Collections.swap(A,A.get(val-1),A.get(i));
                //swap needs to be better optimised
                int firstnumber = A.get(val -1);
                int secondnumber = A.get(i);
                int swap = firstnumber;
                firstnumber = secondnumber;
                secondnumber = swap;
                A.add(i,firstnumber);
                A.add(val-1,secondnumber);

            }
        }
        //iterating again to check missing numbers
        for(int i=0;i<n;i++){
            if(A.get(i) != (i+1)){
                return i+1;
            }
        }
        return n+1;
    }
}
