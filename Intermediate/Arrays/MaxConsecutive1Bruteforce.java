package Intermediate.Arrays;
/*
find Max Consecutive 1's
Given a Binary array,we can atmost replace  a single 0 and 1, find max consecutive 1's we can get.
 */

public class MaxConsecutive1Bruteforce {
    public static void main(String[] args) {
        int[] A = {0,1,1,1,0,1,1,0,1,1,0};
        int answer =0;
        int n = A.length;
        int countofOne=0;
        for(int i=0;i<n;i++){
            if(A[i] == 1){
                countofOne++;
            }
        }
        if(countofOne == n){
            System.out.println(n);
        }
        else{
            answer = findMaxConsecutiveOne(A,n);
            System.out.println(answer);
        }
    }
    public static int findMaxConsecutiveOne(int[]A,int n){
        int answer=0;
        for(int i=0;i<n;i++){
            if(A[i] ==0){
                int left =0;
                for(int l=i-1;l>=0;l--){
                    if(A[l] == 1){
                        left++;
                    }
                    else
                        break;
                }
                int right =0;
                for(int r=i+1;r<n;r++){
                    if(A[r] == 1){
                        right++;
                    }
                    else
                        break;
                }
                answer = Math.max(answer,left+right+1);
            }
        }
        return answer;
    }
}
