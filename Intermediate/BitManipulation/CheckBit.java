package Intermediate.BitManipulation;
/*
here true being set and false being unset, hence we are trying to check if this is set or unset.
 */

public class CheckBit {
    public static void main(String[] args) {
        int n= 82;
        int i=3;
        if(((n >> i) & 1) == 0){
            System.out.println(false);
        }
        else{
            System.out.println(true);
        }
    }
}
