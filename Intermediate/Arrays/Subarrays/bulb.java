package Intermediate.Arrays.Subarrays;
/*
All bulbs are connected through a circuit and the circuit is faulty. All the bulbs on r.h.s will be toggled.
Min number of switch pressing such that all bulbs are finally "ON".
0 -> bulb is off
1-> bulb is on
 */

public class bulb {
    public static void main(String[] args) {
        int[] bulbs = {1,0,1,0,0,1,1,0,1};
        int n = bulbs.length;
        int count =0;
        int current;
        for(int i=0;i<n;i++){
            if(count %2 ==0){
                current = bulbs[i];
            }
            else{
                current = 1-bulbs[i];
            }
            if(current ==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
