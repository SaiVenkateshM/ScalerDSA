package Advance.Maths.GCD;

public class DeleteOne {
    public static void main(String[] args) {
        int[] A = {7,21};
        int answer = findGreatestGCD(A);
        System.out.println(answer);
    }
    public static int findGreatestGCD(int[] A){
        int n = A.length;
        int[] pgcd = new int[n];
        int[] sgcd = new int[n];

        pgcd[0] = A[0];
        for(int i=1;i<n;i++){
            pgcd[i] = gcd(pgcd[i-1],A[i]);
        }
        //Construct sufix gcd
        sgcd[n-1] = A[n-1];
        for(int i=n-2;i>=0;i--){
            sgcd[i] = gcd(sgcd[i+1],A[i]);
        }
        int ans = sgcd[1];
        for(int i=1;i<n-1;i++){
            int left = pgcd[i-1];
            int right = sgcd[i+1];
            ans = Math.max(ans,gcd(left,right));
        }
        return ans;
    }
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
