package Advance.Array;

import java.util.ArrayList;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<>();
        ArrayList<Interval> answer = new ArrayList<>();
        intervals.add(new Interval(1,3));
        intervals.add(new Interval(2,6));
        intervals.add(new Interval(8,10));
        intervals.add(new Interval(15,18));
        answer = checkOverlappingInterval(intervals);

        for(int i=0;i<answer.size();i++){
            System.out.print(answer.get(i).start+","+answer.get(i).end);
            System.out.print(",");
        }
        System.out.println(" ");
    }
    public static ArrayList<Interval> checkOverlappingInterval(ArrayList<Interval> intervals){
        ArrayList<Interval> answer = new ArrayList<>();
        int n = intervals.size();
        for(int i=0;i<n-1;i++){
            if(intervals.get(i).end > intervals.get(i +1).start){

            }
        }
        return answer;
    }
}
