package Intermediate.Arrays.PrefixSum;

public class specialIndex {
    public static void main(String[] args) {
        int[] A = {1, 1, 1};
        int answer = findSpecialIndex(A);
        System.out.println(answer);
    }
    public static int findSpecialIndex(int[] A){
        int n = A.length;
        int count =0;
        int[] prefixOddSum = new int[n];
        int[] prefixEvenSum = new int[n];
        prefixOddSum[0] = 0;
        for(int i=0;i<n;i++){
            if(i ==0){
                prefixEvenSum[i] = A[i];
            }
            else if(i %2 ==0){

                prefixEvenSum[i] = prefixEvenSum[i-1]+A[i];
                prefixOddSum[i] = prefixOddSum[i-1];
            }

            else{
                prefixOddSum[i] =prefixOddSum[i-1]+A[i];
                prefixEvenSum[i] = prefixEvenSum[i-1];
            }
        }
        for(int i=0;i<n;i++){
            int sumEven = prefixOddSum[n-1] - prefixOddSum[i];
            if(i !=0){
                sumEven += prefixEvenSum[i-1];
            }
            int sumOdd = prefixEvenSum[n-1] - prefixEvenSum[i];
            if(i != 0){
                sumOdd += prefixOddSum[i-1];
            }
            if(sumEven == sumOdd){
                count ++;
            }
        }
        return count;
    }
}
