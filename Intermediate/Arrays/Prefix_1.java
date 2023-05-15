package Intermediate.Arrays;
/*
Given an array of size N, and Q queries of the format s and e. Return sum of elements from index s to e.
 */
public class Prefix_1 {
    public static void main(String[] args) {
        int[] A = {-3,6,2,4,5,2,8,-9,3,1};
        int startIndex = 4;
        int endIndex = 6;
        int answer = findSum(A,startIndex,endIndex);
        System.out.println(answer);
    }
    public static int findSum(int[] A,int s, int e){
        int len = A.length;

        int[] prefixSum = new int[len];
        for(int i=0;i<=len -1;i++){
            if(i==0)
                prefixSum[i] = A[i];
            else
                prefixSum[i] = prefixSum[i-1] + A[i];
        }
        int sum = prefixSum[e] - prefixSum[s-1];// to calculate the prefix we always have to take index before the start index.
        return sum;
    }
}
