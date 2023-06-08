package Intermediate.Arrays.PrefixSum;
/*
Given an array of size N.
You have to pick B elements in total.(Some from the left and some from the right) to get the maximum sum
 */

public class Pickfrombothsides {
    public static void main(String[] args) {
        int[] A = {5,2,8,3,6,11,1,4};
        int n = A.length;
        int B = 4;
        // increasing the size because for the edge case where 0 element is selected from prefix
        // and rest from suffix.
        int[] prefixOfA = new int[n+1];
        int[] suffixOfA = new int[n+1];

        //prefix sum
        for(int i=1;i<=n;i++){
            prefixOfA[i] = prefixOfA[i-1]+ A[i-1];
        }
        //Suffix sum
        for(int i=n-1;i>=0;i--){
            suffixOfA[i] = suffixOfA[i+1]+ A[i];
        }
        int answer = Integer.MIN_VALUE;
        for(int i=0;i<=B;i++){
            answer = Math.max(answer,prefixOfA[i] +suffixOfA[n-B+i]);
        }
        System.out.println(answer);
    }
}
