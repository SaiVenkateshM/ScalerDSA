package Intermediate.Arrays.PrefixSum;

import java.util.ArrayList;
import java.util.Arrays;

public class rangeSumQuery {
    public static void main(String[] args) {
        ArrayList<Long> answer = new ArrayList<>();
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2,2,2));
        ArrayList<Integer> val1 = new ArrayList<>(Arrays.asList(0,0));
        ArrayList<Integer> val2 = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

        B.add(val1);
        B.add(val2);
        answer = findRangeSumQuery(A,B);

        for(int i=0;i<answer.size();i++){
            System.out.println(answer.get(i));
        }
    }
    public static ArrayList<Long> findRangeSumQuery(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B){

        int n = A.size();
        int start =0;
        ArrayList<Long> answer = new ArrayList<>();
        int end =0;
        ArrayList<Long> prefixSum= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i==0){
                prefixSum.add(Long.valueOf(A.get(i)));
            }
            else{
                prefixSum.add(prefixSum.get(i-1) + A.get(i));
            }
        }

        int row = B.size();
        for(int i=0;i<row;i++){

            start = B.get(i).get(0);
            end = B.get(i).get(1);
            if(start != 0){
                answer.add( (prefixSum.get(end) - prefixSum.get(start-1)));
            }
            else{
                answer.add(prefixSum.get(end));
            }
        }
        return answer;
    }
}
