package Intermediate.Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ColourfulNumber {
    public static void main(String[] args) {
        int A =236;
        int answer = findColourfulNumber(A);
        System.out.println(answer);
    }
    public static int findColourfulNumber(int A){
        List<Integer> numbers = new ArrayList<>();
        while(A != 0){

            int var = A %10;
            numbers.add(var);
            A = A/10;
        }
        Collections.reverse(numbers);
        HashSet<Integer> answer = new HashSet<>();
        int n = numbers.size();
        for(int i=0;i<n;i++){
            int prod = 1;
            for(int j=i;j<n;j++){
                prod = prod* numbers.get(j);
                if(answer.contains(prod)){
                    return 0;
                }
                else{
                    answer.add(prod);
                }
            }
        }
        return 1;
    }
}
