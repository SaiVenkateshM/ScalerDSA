package Advance.Array;

import java.util.ArrayList;

public class MergeIntervalSelf {
    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<>();
        Interval newInterval = new Interval(2, 5);
        ArrayList<Interval> answer = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(6, 9));
        answer = insert(intervals, newInterval);

        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i).start + "," + answer.get(i).end);
            System.out.print(",");
        }
        System.out.println(" ");
    }
    public static ArrayList<Interval> insert(ArrayList<Interval> intervals,Interval newInterval){
        ArrayList<Interval> answer = new ArrayList<>();
        int n =intervals.size();
        if(n ==0 || intervals.get(n-1).end < newInterval.start){// this condition check for if there is need to
            answer.add(newInterval);
            return answer;
        }
        answer = checkforOverlap(intervals,newInterval);
        return answer;
    }
    public static ArrayList<Interval> checkforOverlap(ArrayList<Interval> intervals, Interval newInterval){
        ArrayList<Interval> answer = new ArrayList<>();
        int n =intervals.size();
        for(int i=0;i<n;i++){
            if(intervals.get(i).end < newInterval.start){
                answer.add(intervals.get(i));
            }
            else if(intervals.get(i).start > newInterval.end){
                answer.add(newInterval);
                for(int j=i;j<n;j++){
                    answer.add(intervals.get(j));
                }
                return answer;
            }
            else{
                // overlapping intervals
                newInterval.start = Math.min(intervals.get(i).start, newInterval.start);
                newInterval.end = Math.max(intervals.get(i).end, newInterval.end);
            }
        }
        answer.add(newInterval);
        return answer;
    }
}

